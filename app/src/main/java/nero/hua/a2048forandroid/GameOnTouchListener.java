package nero.hua.a2048forandroid;

import android.view.MotionEvent;
import android.view.View;

public class GameOnTouchListener implements View.OnTouchListener {

    private float startX;
    private float startY;
    private float offsetX;
    private float offsetY;

    private GameDataAndLogic gameDataAndLogic;

    public GameOnTouchListener(GameDataAndLogic gameDataAndLogic) {
        this.gameDataAndLogic = gameDataAndLogic;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (MotionEvent.ACTION_DOWN == motionEvent.getAction()) {
            startX = motionEvent.getX();
            startY = motionEvent.getY();
        }
        else if (MotionEvent.ACTION_UP == motionEvent.getAction()) {
            offsetX = motionEvent.getX() - startX;
            offsetY = motionEvent.getY() - startY;

            if (Math.abs(offsetX) >= Math.abs(offsetY)) {
                if (offsetX < -5) {
                    System.out.println("left");
                    gameDataAndLogic.onLeft();
                }
                else if (offsetX > 5) {
                    System.out.println("right");
                    gameDataAndLogic.onRight();
                }
            }
            else {
                if (offsetY < -5) {
                    System.out.println("up");
                    gameDataAndLogic.onUp();
                }
                else if (offsetY > 5) {
                    System.out.println("down");
                    gameDataAndLogic.onDown();
                }
            }
        }
        return true;
    }

}
