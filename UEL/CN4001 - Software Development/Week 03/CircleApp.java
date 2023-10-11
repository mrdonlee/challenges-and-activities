/**
 * This program will calculate diameter and area of a circle.
 * The user will be asked for imput of the radius.
 *
 * @author Don Lee
 * @version week_03
 */

import java.util.Scanner;

public class CircleApp
{
    public static void main(String[] args)
    {
        final double PI = 3.142;
        double r, d, a;

        Scanner sc = new Scanner(System.in);

        System.out.println("*** CIRCLE APP ***\n");
        System.out.print("Enter radius: ");
        r = sc.nextDouble();

        d = 2 * r;
        a = PI * (r * r);

        System.out.println("\nDiameter: " + d);
        System.out.println("Area: " + a);

        System.out.println("\nEND OF PROGRAM");

    }
}
