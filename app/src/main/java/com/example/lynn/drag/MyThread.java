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
        keepGoing = true;
    }

    public boolean getKeepGoing() {
        return(keepGoing);
    }

    @Override
    public void run() {
        while (keepGoing) {
            if (left) {
                center.x -= 10;
                center.y -= 10;

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

}
