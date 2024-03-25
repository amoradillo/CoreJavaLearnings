package NestedLoopChallenges;

import java.util.Scanner;

public class PrintRectangle {

    public static void main(String[] args)
    {



        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows do you want?");
        int rows = scanner.nextInt();
        System.out.println("How many columns do you want?");
        int columns = scanner.nextInt();
        System.out.println("What symbol do you want to output?");
        String symbol = scanner.next();


        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(symbol);
            }

            System.out.println();
        }

        

    }


}
