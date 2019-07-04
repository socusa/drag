package com.example.lynn.drag;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static MyView myView;
    public static MyListener listener = new MyListener();
    public static Button button;
    public static int width;
    public static int height;
    public static TextView message;
    public static Point center;
    public static boolean left = true;
    public static boolean up = true;
    public static MyThread myThread;
    public static Range rangeLeft;
    public static Range rangeRight;
    public static RelativeLayout layout1;
    public static RelativeLayout layout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(myView = new MyView(this));
    }
}
