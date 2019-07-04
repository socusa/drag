package com.example.lynn.drag;

import static com.example.lynn.drag.MainActivity.*;

public class MyThread implements Runnable {
    private Thread thread;
    private boolean keepGoing;

    public MyThread() {
        thread = new Thread(this);

        keepGoing = true;

        thread.start();
    }

    private void pause(double seconds) {
        try {
            Thread.sleep((int)(seconds*1000));
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    @Override
    public void run() {
        while (keepGoing) {
            if (left) {
                center.x -= 10;
                center.y -= 10;

                myView.invalidate();

            }

        }


    }

}
