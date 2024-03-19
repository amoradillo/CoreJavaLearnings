package InputValuesUsingScanner;

import java.util.Scanner;

public class InputValues

{
    // make sure the data types is matching the Scanner data types
    // nextLine = String, nextInt = int, nextDouble = double etc.
    // Common Problem, if you use nextLine after nextInt or nextInt after nextLine or anything else. It will output blank
    // If you try to use nextInt() after nextLine(), and there is a newline character left in the buffer from the previous nextLine() call,
    // nextInt() might interpret that newline character as input, causing it to return an empty string or produce unexpected behavior.
    // Temporary Work : around is to you can add an extra nextLine() call after nextInt()
    // to consume the newline character before calling nextLine(), or you can use Integer.parseInt() to parse integer inputs.
    // in tagalog: yung nextInt pagnatapos ka magenter yung escape sequence sa Scanner is going to be on nextLine as well

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is you favorite food?");
        String food = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);


    }

}
