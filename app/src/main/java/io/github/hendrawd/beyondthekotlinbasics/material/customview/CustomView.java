package io.github.hendrawd.beyondthekotlinbasics.material.customview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import io.github.hendrawd.beyondthekotlinbasics.R;

/**
 * @author hendrawd on 09 Oct 2018
 */
public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setBackgroundResource(R.mipmap.ic_launcher_round);
        setAlpha(.5F);
        // and other customizations
    }
}
