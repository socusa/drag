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

        RelativeLayout layout1 = new RelativeLayout(context);

        layoutParams = new LayoutParams(width,2*(height-175)/3);

        layout1.setId(generateViewId());

        layout1.setLayoutParams(layoutParams);

        layout1.setBackgroundColor(0xFF8F0000);

        addView(layout1);

        RelativeLayout layout2 = new RelativeLayout(context);

        layoutParams = new LayoutParams(width,(height-175)/3);

        layoutParams.addRule(BELOW,layout1.getId());

        layout2.setLayoutParams(layoutParams);

        layout2.setBackgroundColor(0xFF00008F);

        addView(layout2);
    }

}
