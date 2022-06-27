package nero.hua.a2048forandroid;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

public class Card extends FrameLayout {

    private int number;

    private TextView label;

    public Card(@NonNull Context context) {
        super(context);

        label = new TextView(getContext());
        label.setTextSize(32);
        label.setGravity(Gravity.CENTER);
        label.setBackgroundColor(0x33FFFFFF);

        LayoutParams layoutParams = new LayoutParams(-1, -1);
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
