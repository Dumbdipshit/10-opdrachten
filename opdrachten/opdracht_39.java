package opdrachten;

import java.util.*;
import java.lang.Math;

public class opdracht_39 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] numbers = new int[3];
        int i;

        i = 0;
        int repeat;
        int declare;

        declare = random.nextInt(11);
        for (repeat = 1; repeat <= declare; repeat++) {
            for (i = 0; i <= 2; i++) {
                numbers[i] = random.nextInt(5);
            }
            System.out.println(""+numbers[0] + numbers[1] + numbers[2]);
        }
        System.out.println("totaal " + declare + " keer herhaald");
    }
}

