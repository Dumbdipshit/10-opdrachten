package opdrachten;

public class opdracht_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ik begrijp niet hoe ik het moet doen ik ben vergenten om hoe je de Int en de letter kan vinden in een string

		
		String string = "ik kwam niet uit bij opdracht 38";
		int count = 0;
		for (int i = 0, length = string.length(); i < length; i++) {
			
		    if (Character.isDigit(string.charAt(i))) { count=count+1;}
		    
		    } System.out.println(count);
		
		
		
		
	}

}
