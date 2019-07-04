package com.example.lynn.drag;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import static com.example.lynn.drag.MainActivity.*;

public class MyListener implements View.OnTouchListener,View.OnClickListener {
    private float offsetX;
    private float offsetY;

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)view.getLayoutParams();

        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
        //    offsetX = motionEvent.getRawX() - layoutParams.leftMargin;
            offsetY = motionEvent.getRawY() - layoutParams.topMargin;
        } else if (motionEvent.getAction() == MotionEvent.ACTION_MOVE) {
         //   layoutParams.leftMargin = (int)(motionEvent.getRawX() - offsetX);
            layoutParams.topMargin = (int)(motionEvent.getRawY() - offsetY);

            view.setLayoutParams(layoutParams);

            RelativeLayout.LayoutParams layoutParamsLeft = (RelativeLayout.LayoutParams)layout1.getLayoutParams();
            RelativeLayout.LayoutParams layoutParamsRight = (RelativeLayout.LayoutParams)layout2.getLayoutParams();

            rangeLeft = new Range(layoutParamsLeft.topMargin,layoutParamsLeft.topMargin + 400);
            rangeRight = new Range(layoutParamsRight.topMargin,layoutParamsRight.topMargin + 400);

            message.setText(width + " " + height + " " + (height - ((RelativeLayout.LayoutParams)(button.getLayoutParams())).topMargin));
        }

        return (true);
    }

    @Override
    public void onClick(View view) {
        if (!myThread.getKeepGoing())
            myThread.start();
        else
            myThread.stop();
    }
}
