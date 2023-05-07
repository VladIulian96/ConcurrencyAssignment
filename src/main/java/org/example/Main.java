package org.example;

public class Main {

    public static int combination = 8325;
    public static boolean foundCombination = false;
    public static boolean outOfTime = false;

    public static void main(String[] args) {
        ThiefThread thief1 = new ThiefThread("Thief1", 1, 2500);
        ThiefThread thief2 = new ThiefThread("Thief2", 2500, 5000);
        ThiefThread thief3 = new ThiefThread("Thief3", 5000, 7500);
        ThiefThread thief4 = new ThiefThread("Thief4", 7500, 10000);
        thief1.start();
        thief2.start();
        thief3.start();
        thief4.start();

        CopThread cop = new CopThread();
        cop.start();
    }

}
