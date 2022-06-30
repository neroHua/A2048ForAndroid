package nero.hua.a2048forandroid;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;

import java.util.ArrayList;
import java.util.List;

public class GameDataAndLogic {

    public Context context;
    public int score = 0;

    public Card[][] cardArray = new Card[GameConfig.CARD_COUNT][GameConfig.CARD_COUNT];
    private List<Point> pointList = new ArrayList<>();

    public GameDataAndLogic() {
        initCard();
    }

    public GameDataAndLogic(Context context) {
        this.context = context;
        initCard();
    }

    void initCard() {
        for (int i = 0; i < GameConfig.CARD_COUNT; i++) {
            for (int j = 0; j < GameConfig.CARD_COUNT; j++) {
                Card card = null == context ? new Card() : new Card(context);
                card.setNumberAndLabel(0);
                cardArray[i][j] = card;
            }
        }
    }

    public void startGame() {
        cleanGame();

        addRandomNumber();
        addRandomNumber();
    }

    public void cleanGame() {
        for (int i = 0; i < GameConfig.CARD_COUNT; i++) {
            for (int j = 0; j < GameConfig.CARD_COUNT; j++) {
                cardArray[i][j].setNumberAndLabel(0);
            }
        }

        score = 0;
    }

    public void addRandomNumber() {
        pointList.clear();

        for (int i = 0; i < GameConfig.CARD_COUNT; i++) {
            for (int j = 0; j < GameConfig.CARD_COUNT; j++) {
                if (cardArray[i][j].isEmpty()) {
                    pointList.add(new Point(i, j));
                }
            }
        }

        Point point = pointList.get((int) (Math.random() * pointList.size()));

        cardArray[point.x][point.y].setNumberAndLabel(Math.random() >= GameConfig.PROBABILITY_FOR_2 ? GameConfig.RANDOM_4 : GameConfig.RANDOM_2);
    }

    public void onRight() {
        boolean moved = right();

        if (moved) {
            onMove();
        }
    }

    public boolean right() {
        boolean moved = false;
        for (int i = 0; i < GameConfig.CARD_COUNT; i++) {
            for (int j = GameConfig.CARD_COUNT - 1; j >= 0; j--) {
                for (int m = j - 1; m >= 0 ; m--) {
                    if (cardArray[i][m].isNotEmpty()) {
                        if (cardArray[i][j].isEmpty()) {
                            cardArray[i][j].setNumberAndLabel(cardArray[i][m].getNumber());
                            cardArray[i][m].setNumberAndLabel(0);

                            j++;
                            moved = true;
                        }
                        else if (cardArray[i][j].equals(cardArray[i][m])) {
                            cardArray[i][j].setNumberAndLabel(cardArray[i][j].getNumber() * 2);
                            cardArray[i][m].setNumberAndLabel(0);

                            score += cardArray[i][j].getNumber();
                            moved = true;
                        }

                        break;
                    }
                }
            }
        }
        return moved;
    }

    public void onLeft() {
        boolean moved = left();

        if (moved) {
            onMove();
        }
    }

    public boolean left() {
        boolean moved = false;
        for (int i = 0; i < GameConfig.CARD_COUNT; i++) {
            for (int j = 0; j < GameConfig.CARD_COUNT; j++) {
                for (int m = j + 1; m < GameConfig.CARD_COUNT; m++) {
                    if (cardArray[i][m].isNotEmpty()) {
                        if (cardArray[i][j].isEmpty()) {
                            cardArray[i][j].setNumberAndLabel(cardArray[i][m].getNumber());
                            cardArray[i][m].setNumberAndLabel(0);

                            j--;
                            moved = true;
                        }
                        else if (cardArray[i][j].equals(cardArray[i][m])) {
                            cardArray[i][j].setNumberAndLabel(cardArray[i][j].getNumber() * 2);
                            cardArray[i][m].setNumberAndLabel(0);

                            score += cardArray[i][j].getNumber();
                            moved = true;
                        }

                        break;
                    }
                }
            }
        }

        return moved;
    }

    public void onUp() {
        boolean moved = up();

        if (moved) {
            onMove();
        }
    }

    public boolean up() {
        boolean moved = false;
        for (int i = 0; i < GameConfig.CARD_COUNT; i++) {
            for (int j = 0; j < GameConfig.CARD_COUNT - 1; j++) {
                for (int m = j + 1; m < GameConfig.CARD_COUNT; m++) {
                    if (cardArray[m][i].isNotEmpty()) {
                        if (cardArray[j][i].isEmpty()) {
                            cardArray[j][i].setNumberAndLabel(cardArray[m][i].getNumber());
                            cardArray[m][i].setNumberAndLabel(0);

                            j--;
                            moved = true;
                        }
                        else if (cardArray[j][i].equals(cardArray[m][i])) {
                            cardArray[j][i].setNumberAndLabel(cardArray[j][i].getNumber() * 2);
                            cardArray[m][i].setNumberAndLabel(0);

                            score += cardArray[j][i].getNumber();
                            moved = true;
                        }

                        break;
                    }
                }
            }
        }

        return moved;
    }

    public void onDown() {
        boolean moved = down();

        if (moved) {
            onMove();
        }
    }

    public boolean down() {
        boolean moved = false;
        for (int i = 0; i < GameConfig.CARD_COUNT; i++) {
            for (int j = GameConfig.CARD_COUNT - 1; j >= 0; j--) {
                for (int m = j - 1; m >= 0 ; m--) {
                    if (cardArray[m][i].isNotEmpty()) {
                        if (cardArray[j][i].isEmpty()) {
                            cardArray[j][i].setNumberAndLabel(cardArray[m][i].getNumber());
                            cardArray[m][i].setNumberAndLabel(0);

                            j++;
                            moved = true;
                        }
                        else if (cardArray[j][i].equals(cardArray[m][i])) {
                            cardArray[j][i].setNumberAndLabel(cardArray[j][i].getNumber() * 2);
                            cardArray[m][i].setNumberAndLabel(0);

                            score += cardArray[j][i].getNumber();
                            moved = true;
                        }

                        break;
                    }
                }
            }
        }
        return moved;
    }

    public void onMove() {
        addRandomNumber();

        if (!checkComplete()) {
            return;
        }

        if (null == context) {
            return;
        }

        new AlertDialog.Builder(context)
                .setTitle("你好")
                .setMessage("游戏结束")
                .setPositiveButton("重新开始游戏", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startGame();
                    }
                })
                .show();
    }

    public boolean checkComplete() {
        for (int i = 0; i < GameConfig.CARD_COUNT; i++) {
            for (int j = 0; j < GameConfig.CARD_COUNT; j++) {
                if (cardArray[i][j].isEmpty()) {
                    return false;
                }
            }
        }

        for (int i = 0; i < GameConfig.CARD_COUNT - 1; i++) {
            for (int j = 0; j < GameConfig.CARD_COUNT - 1; j++) {
                if (cardArray[i][j].equals(cardArray[i + 1][j])) {
                    return false;
                }
                if (cardArray[i][j].equals(cardArray[i][j + 1])) {
                    return false;
                }
            }
        }

        for (int i = 0; i < GameConfig.CARD_COUNT - 1; i++) {
            if (cardArray[i][GameConfig.CARD_COUNT - 1].equals(cardArray[i + 1][GameConfig.CARD_COUNT - 1])) {
                return false;
            }
        }
        for (int i = 0; i < GameConfig.CARD_COUNT - 1; i++) {
            if (cardArray[GameConfig.CARD_COUNT - 1][i].equals(cardArray[GameConfig.CARD_COUNT - 1][i + 1])) {
                return false;
            }
        }

        return true;
    }

}
