package org.example;

public class ThiefThread extends Thread {

    private final String name;
    private final int start;
    private final int stop;

    public ThiefThread(String name, int start, int stop) {
        this.name = name;
        this.start = start;
        this.stop = stop;
    }

    @Override
    public void run() {
        for(int currentNumber = start; currentNumber < stop; currentNumber++) {
            if(Main.outOfTime) {
                System.exit(0);
            }

            if(currentNumber == Main.combination) {
                Main.foundCombination = true;
                System.out.println("The combination was: " + currentNumber);
                System.exit(0);
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
