package com.example.lynn.drag;

import static com.example.lynn.drag.MainActivity.*;

public class MyThread implements Runnable {
    private Thread thread;
    private boolean keepGoing;

    private void pause(double seconds) {
        try {
            Thread.sleep((int)(seconds*1000));
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void start() {
        thread = new Thread(this);

        keepGoing = true;

        thread.start();
    }

    public void stop() {
        keepGoing = false;
    }

    public boolean getKeepGoing() {
        return(keepGoing);
    }

    @Override
    public void run() {
        while (keepGoing) {
            int distancex = 0;
            int distancey = 0;

            if (center.y < 50)
                up = false;

            if (center.y > height-170)
                up = true;

            if (rangeLeft.contains())
                left = false;

            if (rangeRight.contains())
                left = true;

            distancex = (left) ? 50 : -50;
            distancey = (up) ? 50 : -50;

            center.x -= distancex;
            center.y -= distancey;

            myView.post(new Runnable() {

                @Override
                public void run() {
                    myView.invalidate();
                }

            });

            pause(0.5);
        }


    }

}
