package opdrachten;
import java.util.*;
import java.lang.Math;

public class opdracht_50 {
    public static void main(String[] args) {
        int number;

        number = 0;
        int sum;
        int repeat;

        System.out.println("devisible by 3");
        for (repeat = 1; repeat <= 100; repeat++) {
            number = number + 1;
            sum = number % 3;
            if (sum == 0) {
                System.out.println(number);
            }
        }
        System.out.println("devisible by 5");
        number = 0;
        for (repeat = 1; repeat <= 100; repeat++) {
            number = number + 1;
            sum = number % 5;
            if (sum == 0) {
                System.out.println(number);
            }
        }
        System.out.println("divisible by both");
        number = 0;
        for (repeat = 1; repeat <= 100; repeat++) {
            number = number + 1;
            sum = number % 3;
            if (sum == 0) {
                sum = number % 5;
            }
            if (sum == 0) {
                System.out.println(number);
            }
        }
    }
}
