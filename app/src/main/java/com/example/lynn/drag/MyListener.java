package com.example.lynn.drag;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import static com.example.lynn.drag.MainActivity.button;
import static com.example.lynn.drag.MainActivity.height;
import static com.example.lynn.drag.MainActivity.message;
import static com.example.lynn.drag.MainActivity.width;

public class MyListener implements View.OnTouchListener {
    private float offsetX;
    private float offsetY;

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)view.getLayoutParams();

        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            offsetX = motionEvent.getRawX() - layoutParams.leftMargin;
            offsetY = motionEvent.getRawY() - layoutParams.topMargin;
        } else if (motionEvent.getAction() == MotionEvent.ACTION_MOVE) {
            layoutParams.leftMargin = (int)(motionEvent.getRawX() - offsetX);
            layoutParams.topMargin = (int)(motionEvent.getRawY() - offsetY);

            view.setLayoutParams(layoutParams);

            Button button = (Button)view;

            button.setText("(" + layoutParams.leftMargin + "," + layoutParams.topMargin + ")");

            message.setText(width + " " + height + " " + (height - ((RelativeLayout.LayoutParams)(button.getLayoutParams())).topMargin));
        }

        return (true);
    }
}
