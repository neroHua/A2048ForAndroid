package nero.hua.a2048forandroid;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;

public class GameView extends GridLayout {

    private GameDataAndLogic gameDataAndLogic;

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
        setBackgroundColor(0xFFBBADA0);
        setColumnCount(GameConfig.CARD_COUNT);

        gameDataAndLogic = new GameDataAndLogic(getContext());
        setOnTouchListener(new GameOnTouchListener(gameDataAndLogic));
        addCardView();
        gameDataAndLogic.startGame();
    }

    private void addCardView() {
        for (int i = 0; i < GameConfig.CARD_COUNT; i++) {
            for (int j = 0; j < GameConfig.CARD_COUNT; j++) {
                addView(gameDataAndLogic.cardArray[i][j], GameConfig.CARD_WIDTH, GameConfig.CARD_WIDTH);
            }
        }
    }

}
