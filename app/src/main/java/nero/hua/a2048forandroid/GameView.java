package nero.hua.a2048forandroid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;

public class GameView extends GridLayout {
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


    private void onLeft() {
    }
    private void onRight() {
    }
    private void onUp() {
    }
    private void onDown() {
    }

}
