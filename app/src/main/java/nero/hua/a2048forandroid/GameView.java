package nero.hua.a2048forandroid;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class GameView extends GridLayout {

    private static int CARD_COUNT = 4;

    private static int CARD_GAP = 10;
    private static double PROBABILITY_FOR_2 = 0.9;
    private static int RANDOM_2 = 2;
    private static int RANDOM_4 = 4;

    private Card[][] cardArray = new Card[CARD_COUNT][CARD_COUNT];
    private List<Point> pointList = new ArrayList<>();

    public GameView(Context context) {
        super(context);
        initGameView();
    }

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initGameView();
    }

    public GameView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initGameView();
    }

    private void initGameView() {
        setColumnCount(CARD_COUNT);

        setBackgroundColor(0xFFBBADA0);

        setOnTouchListener(new OnTouchListener() {

            private float startX, startY, offsetX, offsetY;

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (MotionEvent.ACTION_DOWN == motionEvent.getAction()) {
                    startX = motionEvent.getX();
                    startY = motionEvent.getY();
                }
                else if (MotionEvent.ACTION_DOWN == motionEvent.getAction()) {
                    offsetX = motionEvent.getX() - offsetX;
                    offsetY = motionEvent.getY() - offsetY;

                    if (Math.abs(offsetX) >= Math.abs(offsetY)) {
                        if (offsetX < -5) {
                            System.out.println("left");
                            onLeft();
                        }
                        else if (offsetX > 5) {
                            System.out.println("right");
                            onRight();
                        }
                    }
                    else {
                        if (offsetY < -5) {
                            System.out.println("up");
                            onUp();
                        }
                        else if (offsetY > 5) {
                            System.out.println("down");
                            onDown();
                        }
                    }
                }
                return true;
            }

        });
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        int cardWidth = (Math.min(h, w) - CARD_GAP) / CARD_COUNT;

        addCard(cardWidth);

        startGame();
    }

    private void addCard(int cardWidth) {
        for (int i = 0; i < CARD_COUNT; i++) {
            for (int j = 0; j < CARD_COUNT; j++) {
                Card card = new Card(getContext());
                card.setNumberAndLabel(0);
                cardArray[i][j] = card;

                addView(card, cardWidth, cardWidth);
            }
        }
    }

    public void startGame() {
        cleanGame();

        addRandomNumber();
        addRandomNumber();
    }

    public void cleanGame() {
        for (int i = 0; i < CARD_COUNT; i++) {
            for (int j = 0; j < CARD_COUNT; j++) {
                cardArray[i][j].setNumber(0);
            }
        }
    }

    public void addRandomNumber() {
        pointList.clear();

        for (int i = 0; i < CARD_COUNT; i++) {
            for (int j = 0; j < CARD_COUNT; j++) {
                if (cardArray[i][j].isEmpty()) {
                    pointList.add(new Point(i, j));
                }
            }
        }

        Point point = pointList.get((int) (Math.random() * pointList.size()));

        cardArray[point.x][point.y].setNumberAndLabel(Math.random() >= PROBABILITY_FOR_2 ? RANDOM_2 : RANDOM_4);
    }

    private void onRight() {
        boolean moved = false;
        for (int i = 0; i < CARD_COUNT; i++) {
            for (int j = 0; j < CARD_COUNT - 1; j++) {
                if (cardArray[i][j].isEmpty()) {
                    int m = j;
                    while (m > 0 && cardArray[i][m - 1].isNotEmpty()) {
                        cardArray[i][m].setNumberAndLabel(cardArray[i][m - 1].getNumber());
                        cardArray[i][m - 1].setNumberAndLabel(0);

                        moved = true;
                        m--;
                    }
                } else if (cardArray[i][j].equals(cardArray[i][j + 1])) {
                    cardArray[i][j + 1].setNumberAndLabel(cardArray[i][j].getNumber() + cardArray[i][j + 1].getNumber());
                    cardArray[i][j].setNumberAndLabel(0);

                    int m = j - 1;
                    while (m > 0 && cardArray[i][m - 1].isNotEmpty()) {
                        cardArray[i][m].setNumberAndLabel(cardArray[i][m - 1].getNumber());
                        cardArray[i][m - 1].setNumberAndLabel(0);

                        m--;
                    }

                    moved = true;
                    j--;
                }
            }
        }

        if (moved) {
            addRandomNumber();
        }
    }

    private void onLeft() {
        boolean moved = false;
        for (int i = 0; i < CARD_COUNT; i++) {
            for (int j = CARD_COUNT - 1; j > 0; j--) {
                if (cardArray[i][j].isEmpty()) {
                    int m = j;
                    while (m < CARD_COUNT - 1 && cardArray[i][m + 1].isNotEmpty()) {
                        cardArray[i][m].setNumberAndLabel(cardArray[i][m + 1].getNumber());
                        cardArray[i][m + 1].setNumberAndLabel(0);

                        moved = true;
                        m++;
                    }
                } else if (cardArray[i][j].equals(cardArray[i][j - 1])) {
                    cardArray[i][j - 1].setNumberAndLabel(cardArray[i][j].getNumber() + cardArray[i][j - 1].getNumber());
                    cardArray[i][j].setNumberAndLabel(0);

                    int m = j + 1;
                    while (m < CARD_COUNT - 1 && cardArray[i][m + 1].isNotEmpty()) {
                        cardArray[i][m].setNumberAndLabel(cardArray[i][m + 1].getNumber());
                        cardArray[i][m + 1].setNumberAndLabel(0);

                        m++;
                    }

                    moved = true;
                    j--;
                }
            }
        }

        if (moved) {
            addRandomNumber();
        }
    }

    private void onUp() {
        boolean moved = false;
        for (int i = 0; i < CARD_COUNT; i++) {
            for (int j = CARD_COUNT - 1; j > 0; j--) {
                if (cardArray[j][i].isEmpty()) {
                    int m = j;
                    while (m < CARD_COUNT - 1 && cardArray[m + 1][i].isNotEmpty()) {
                        cardArray[m][i].setNumberAndLabel(cardArray[m + 1][i].getNumber());
                        cardArray[m + 1][i].setNumberAndLabel(0);

                        moved = true;
                        m++;
                    }
                } else if (cardArray[j][i].equals(cardArray[j - 1][i])) {
                    cardArray[j - 1][i].setNumberAndLabel(cardArray[j][i].getNumber() + cardArray[j - 1][i].getNumber());
                    cardArray[j][i].setNumberAndLabel(0);

                    int m = j + 1;
                    while (m < CARD_COUNT - 1 && cardArray[m + 1][i].isNotEmpty()) {
                        cardArray[m][i].setNumberAndLabel(cardArray[m + 1][i].getNumber());
                        cardArray[m + 1][i].setNumberAndLabel(0);

                        m++;
                    }

                    moved = true;
                    j--;
                }
            }
        }

        if (moved) {
            addRandomNumber();
        }
    }

    private void onDown() {
        boolean moved = false;
        for (int i = 0; i < CARD_COUNT; i++) {
            for (int j = 0; j < CARD_COUNT - 1; j++) {
                if (cardArray[j][i].isEmpty()) {
                    int m = j;
                    while (m > 0 && cardArray[m - 1][i].isNotEmpty()) {
                        cardArray[m][i].setNumberAndLabel(cardArray[m - 1][i].getNumber());
                        cardArray[m - 1][i].setNumberAndLabel(0);

                        moved = true;
                        m--;
                    }
                } else if (cardArray[j][i].equals(cardArray[j + 1][i])) {
                    cardArray[j + 1][i].setNumberAndLabel(cardArray[j][i].getNumber() + cardArray[j + 1][i].getNumber());
                    cardArray[j][i].setNumberAndLabel(0);

                    int m = j - 1;
                    while (m > 0 && cardArray[m - 1][i].isNotEmpty()) {
                        cardArray[m][i].setNumberAndLabel(cardArray[m - 1][i].getNumber());
                        cardArray[m - 1][i].setNumberAndLabel(0);

                        m--;
                    }

                    moved = true;
                    j--;
                }
            }
        }

        if (moved) {
            addRandomNumber();
        }
    }

}
