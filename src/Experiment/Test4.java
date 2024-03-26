package Experiment;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args)
    {

        ArrayList<ArrayList<Double>> totalNum = new ArrayList<>();

        ArrayList<Double> num1 = new ArrayList<>();
        num1.add(2.5);
        num1.add(0.6);
        num1.add(1.0);




        ArrayList<Double> num2 = new ArrayList<>();
        num2.add(5.1);
        num2.add(0.50);
        num2.add(7.1);

        totalNum.add(num1);
        totalNum.add(num2);


        System.out.println("For each:");

        System.out.println(totalNum.size());

        for (ArrayList<Double> TheTotalNumber: totalNum)
        {
            System.out.println(TheTotalNumber);
        }

        System.out.println("For Loop");



        for (int i = 0; i < totalNum.size(); i++)
        {
            for (int j = 0; j < totalNum.get(i).size(); j++) {
                Double element = totalNum.get(i).get(j);
                if(element>0.6)
                {
                    System.out.print(totalNum.get(i).get(j) + " ");
                }

            }

            System.out.println();

        }


    }
}
