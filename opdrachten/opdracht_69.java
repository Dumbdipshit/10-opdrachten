package opdrachten;

import java.util.*;
import java.lang.Math;

public class opdracht_69 {
	
	//nice ( ͡° ͜ʖ ͡°)
	
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String word;

        word = input.nextLine();
        int lenght;

        lenght = word.length();
        lenght = lenght / 2;
        int i;

        for (i = 0; i <= lenght - 1; i++) {
            System.out.println(word.charAt(i));
        }
    }
}

