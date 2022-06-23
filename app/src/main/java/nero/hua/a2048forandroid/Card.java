package nero.hua.a2048forandroid;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

public class Card extends FrameLayout {

    private int number;

    private TextView label;

    public Card(@NonNull Context context) {
        super(context);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumberAndLabel(int number) {
        this.number = number;
        label.setText(number + "");
    }

    public boolean equals(Card card) {
        return null == card ? false : this.number == card.getNumber();
    }

}
