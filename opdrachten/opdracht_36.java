package opdrachten;
import java.util.*;
import java.lang.Math;

public class opdracht_36 {
    public static void main(String[] args) {
        double radius;

        radius = 6371.01;
        double x1;

        x1 = 25;
        double y1;

        y1 = 35;
        double x2;

        x2 = 35.5;
        double y2;

        y2 = 25.5;
        System.out.println(radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
    }
}
