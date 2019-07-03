package com.example.lynn.drag;

import android.content.Context;
import android.graphics.Point;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.lynn.drag.MainActivity.*;

public class MyView extends RelativeLayout {

    public MyView(Context context) {
        super(context);

        button = new Button(context);

        button.setTextSize(20);

        button.setOnTouchListener(listener);

        addView(button);

        message = new TextView(context);

        LayoutParams layoutParams = new LayoutParams(400,100);

        layoutParams.leftMargin = 500;
        layoutParams.topMargin = 200;

        message.setLayoutParams(layoutParams);

        message.setTextSize(20);

        Point point = Util.sizeOfScreen(context);

        width = point.x;
        height = point.y;

        addView(message);
    }

}
