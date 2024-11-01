package opdrachten;
import java.util.*;
import java.lang.Math;

public class opdracht_32 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int var1 = input.nextInt();
        int var2 = input.nextInt();
        if (var1 == var2) {
            System.out.println(var1 + "==" + var2);
        } else {
            System.out.println(var1 + "!=" + var2);
        }
        if (var1 < var2) {
            System.out.println(var1 + "<" + var2);
        } else {
            if (var1 > var2) {
                System.out.println(var1 + ">" + var2);
            }
        }
    }
}
