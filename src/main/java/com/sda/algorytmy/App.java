package com.sda.algorytmy;


public class App {
    public static void main(String[] args) {

        System.out.println(euklides(24, 36));

        System.out.println(euklidesR(24, 36));
    }

    private static int euklidesR(int a, int b) {

        return euklides(b, a % b);
    }


    private static int euklides(int a, int b) {

        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;

        }

        return a;
    }
}
