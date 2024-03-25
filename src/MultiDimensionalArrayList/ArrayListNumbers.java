package MultiDimensionalArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListNumbers
{
    public static void main(String[] args)
    {

        ArrayList<ArrayList<Double>> totalNumbers = new ArrayList<>();

        ArrayList<Double> numbers1 = new ArrayList<>();
        numbers1.add(0.25);
        numbers1.add(0.50);
        numbers1.add(0.60);


        ArrayList<Double> numbers2 = new ArrayList<>();
        numbers2.add(0.75);
        numbers2.add(0.80);
        numbers2.add(1.00);

        ArrayList<Double> numbers3 = new ArrayList<>();
        numbers3.add(0.85);
        numbers3.add(0.95);
        numbers3.add(0.96);

        totalNumbers.add(numbers1);
        totalNumbers.add(numbers2);
        totalNumbers.add(numbers3);



        for(int i=totalNumbers.size(); i >= 0 ; i--)
        {
            for (int j = 0; totalNumbers.get(i).size() >= j; j++)
            {
                    System.out.print(totalNumbers.get(i).get(j) + " ");

            }
            System.out.println();

        }

    }
}
