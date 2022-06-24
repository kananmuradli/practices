package com.company.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduledTask extends TimerTask {

    Date now;

    @Override
    public void run() {
        now = new Date();
        System.out.println("Time is : " + now);
    }

    public static void main(String[] args) throws InterruptedException {
        Timer time = new Timer();
        ScheduledTask scheduledTask = new ScheduledTask();
        time.schedule(scheduledTask, 0, 1000);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Execution in Main Thread ...." + i);
            Thread.sleep(1000);
            if (i == 5) {
                System.out.println("Application Terminates");
                System.exit(0);
            }
        }
    }
}


