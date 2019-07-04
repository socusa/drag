package com.example.lynn.drag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.lynn.drag.MainActivity.*;

public class MyView extends RelativeLayout {
    private Paint paint;

    public MyView(Context context) {
        super(context);

        button = new Button(context);

        button.setTextSize(20);

     //   button.setOnTouchListener(listener);

        button.setOnClickListener(listener);

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

        center = new Point(width-100,(height-100)/2);

        addView(message);

        paint = new Paint();

        paint.setColor(0xFF000000);

        setWillNotDraw(false);

        myThread = new MyThread();

        RelativeLayout layout1 = new RelativeLayout(context);

        layoutParams = new LayoutParams(50,400);

        layoutParams.leftMargin = 0;
        layoutParams.topMargin = 0;

        layout1.setLayoutParams(layoutParams);

        layout1.setBackgroundColor(0xFF000000);

        addView(layout1);

        RelativeLayout layout2 = new RelativeLayout(context);

        layoutParams = new LayoutParams(50,400);

        layoutParams.leftMargin = width-50;
        layoutParams.topMargin = 0;

        layout2.setLayoutParams(layoutParams);

        layout2.setBackgroundColor(0xFF000000);

        addView(layout2);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawCircle(center.x,center.y,50,paint);


    }



}
