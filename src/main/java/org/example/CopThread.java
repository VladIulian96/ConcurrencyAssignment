package org.example;

public class CopThread extends Thread {

    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            if(Main.foundCombination) {
                System.exit(0);
            }
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Main.outOfTime = true;
        System.out.println("The thieves have been caught!");
    }

}
