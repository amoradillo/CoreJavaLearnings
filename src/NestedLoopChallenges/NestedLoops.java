package NestedLoopChallenges;

import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args)
    {
        trianglesNumberOfRows(5);

    }


    public static void trianglesNumberOfRows(int n)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a symbol to make a triangle pattern:");
        String symbol = scanner.next();

        for(int i=1; i <= n; i++)
        {
           for(int j=1; j <= i; j++)
           {
               System.out.print(symbol);
           }

            System.out.println();
        }

    }
}
