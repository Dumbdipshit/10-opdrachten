package opdrachten;

import java.util.Scanner;

public class opdracht_37 extends opdracht_36 {
private static Scanner input = new Scanner(System.in);
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String orgineel = input.nextLine();
	    String string = "";
	 
		for (int i = 0; i < orgineel.length(); i++) {
	      string = orgineel.charAt(i) + string;
	      
	    }
	    
	    System.out.println(string);
	}

}
