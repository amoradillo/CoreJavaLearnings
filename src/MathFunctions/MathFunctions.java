package MathFunctions;

import java.util.Scanner;

public class MathFunctions
{
//        double x = 3.14;
//        double y = -10;
//        double z = Math.max(x,y); -max
//        double z = Math.min(x,y); -min
//        double z = Math.abs(y); absolute value ex. -10 the result be 10
//        double  z = Math.sqrt(x); square root
//        double  z = Math.round(x); round 3.14 = 3.0
//        double  z = Math.ceil(x);  always round it up to 4
//        double  z = Math.floor(x);  always round down
    public static void main(String[] args)
    {

        double x;
        double y;
        double z;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x:");
        x = scanner.nextDouble();
        System.out.println("Enter side y:");
        y = scanner.nextDouble();
        z = Math.round(Math.sqrt((x*x) + (y*y)));
        System.out.println("The hypotenuse is: " + z);
        scanner.close();


    }
}
