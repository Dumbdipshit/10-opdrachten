package opdrachten;

import java.util.Scanner;

public class opdracht_33 {
private static Scanner input = new Scanner(System.in);
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int num = input.nextInt();
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
  

            
            num = num / 10;
            

        }
        System.out.println(sum);
		
	}

}
