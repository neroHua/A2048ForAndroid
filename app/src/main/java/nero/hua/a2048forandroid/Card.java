package nero.hua.a2048forandroid;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

public class Card extends FrameLayout {

    private int number;

    private View background;

    private TextView label;

    public Card(@NonNull Context context) {
        super(context);

        LayoutParams layoutParams = null;

        background = new View(getContext());
        layoutParams = new LayoutParams(-1, -1);
        layoutParams.setMargins(10, 10, 0, 0);
        background.setBackgroundColor(0x33ffffff);
        addView(background, layoutParams);

        label = new TextView(getContext());
        label.setTextSize(28);
        label.setGravity(Gravity.CENTER);

        layoutParams = new LayoutParams(-1, -1);
        layoutParams.setMargins(10, 10, 0, 0);
        addView(label, layoutParams);

        setNumberAndLabel(0);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumberAndLabel(int number) {
        this.number = number;

        if (number > 0) {
            label.setText(number + "");
        }
        else {
            label.setText("");
        }

        switch (number) {
            case 0:
                label.setBackgroundColor(0x00000000);
                break;
            case 2:
                label.setBackgroundColor(0xffeee4da);
                break;
            case 4:
                label.setBackgroundColor(0xffede0c8);
                break;
            case 8:
                label.setBackgroundColor(0xfff2b179);
                break;
            case 16:
                label.setBackgroundColor(0xfff59563);
                break;
            case 32:
                label.setBackgroundColor(0xfff67c5f);
                break;
            case 64:
                label.setBackgroundColor(0xfff65e3b);
                break;
            case 128:
                label.setBackgroundColor(0xffedcf72);
                break;
            case 256:
                label.setBackgroundColor(0xffedcc61);
                break;
            case 512:
                label.setBackgroundColor(0xffedc850);
                break;
            case 1024:
                label.setBackgroundColor(0xffedc53f);
                break;
            case 2048:
                label.setBackgroundColor(0xffedc22e);
                break;
            default:
                label.setBackgroundColor(0xff3c3a32);
                break;
        }
    }

    public boolean equals(Card card) {
        return null == card ? false : this.number == card.getNumber();
    }

    public boolean isEmpty() {
        return this.number <= 0;
    }

    public boolean isNotEmpty() {
        return this.number > 0;
    }

}
