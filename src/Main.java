import java.util.Locale;
import java.util.Scanner;


/**
 * Request user for values to create a regular polygon and then describe it.
 */
public class Main  {
    public static void main(String[] args) {
        System.out.println("▲ ■ ⬟ ⬣ REGULAR POLYGON CALCULATOR ⬣ ⬟ ■ ▲");
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        RegularPolygon newPolygon = new RegularPolygon();

        System.out.println("\nHow many sides does your polygon have?");
        newPolygon.setSides(in.nextInt());
        System.out.println("\nWhat is the length of each size?");
        newPolygon.setSideLength(in.nextDouble());

        System.out.println("\nSides: " + newPolygon.getSides());
        System.out.println("Side length: " + newPolygon.getSideLength());
        System.out.printf("Perimeter: %.2f\n", newPolygon.getPerimeter());
        System.out.printf("Area: %.2f\n", newPolygon.getArea());
        System.out.printf("Internal angle: %.2f\n", newPolygon.getInternalAngle());
        System.out.printf("External angle: %.2f\n", newPolygon.getExternalAngle());
    }
}
