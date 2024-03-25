package Array;

public class MultiDimensionalArrays
{
    public static void main(String[] args)
    {
        String [] [] cars =
                {
                        {"Cammaro","Corvette","Silverado"},
                        {"Mustang","Ranger","F-150"},
                        {"Ferrari","Lambo","Tesla"},
                };

        for (int i = 0; i < cars.length; i++)
        {
            for (int j = 0; j < cars[i].length; j++)
            {
                System.out.print(cars[i][j] + " ");
            }

            System.out.println();
        }

    }
}
