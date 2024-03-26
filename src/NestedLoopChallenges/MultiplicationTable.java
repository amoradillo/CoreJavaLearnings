package NestedLoopChallenges;

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of tables do you want to multiply");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++)
        {
            System.out.printf("%4d", i);
        }


        System.out.println("\n=========================================================");



        for (int i = 1; i <= size; i++) {

            System.out.printf("%2d|", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%5d", i * j);
            }

            System.out.println();
        }


//        for (int i = 0; i < ; i++) {
//
//        }

    }


}

