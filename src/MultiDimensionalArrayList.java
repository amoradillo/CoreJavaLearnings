import java.util.ArrayList;

public class MultiDimensionalArrayList
{

    public static void main(String[] args)
    {

        ArrayList<ArrayList<Double>> grid = new ArrayList<>();

        // Creating the first row
        ArrayList<Double> row1 = new ArrayList<>();
        row1.add(5.2);
        row1.add(6.2);
        row1.add(10.5);

        // Creating the second row
        ArrayList<Double> row2 = new ArrayList<>();
        row2.add(8.5);
        row2.add(7.5);
        row2.add(10.5);

        // Adding rows to the 2D ArrayList
        grid.add(row1);
        grid.add(row2);

        // Iterating through the 2D ArrayList using nested loops
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                System.out.print(grid.get(i).get(j) + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
        }

}


