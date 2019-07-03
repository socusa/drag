package com.example.lynn.drag;

import android.content.Context;
import android.widget.Button;
import android.widget.RelativeLayout;

import static com.example.lynn.drag.MainActivity.*;

public class MyView extends RelativeLayout {

    public MyView(Context context) {
        super(context);

        button = new Button(context);

        button.setOnTouchListener(listener);

        addView(button);
    }

}
