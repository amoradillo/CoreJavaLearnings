package Arrays;

public class ArrayFunctions {
    public static void main(String[] args) {
        // array = used to store multiple values in a single variable

//        String[] cars = {"Camaro","Corvette","Tesla"};
//        cars[0] = "Mustang";
//        System.out.println(cars[3]);


        String [] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        int indexToRemove = -1;

        for(int i= 0; i < cars.length; i++)
        {
            String a = cars[i] + ", ";
            if(a.contains("Tesla"))
            {
                indexToRemove = i;
                System.out.println(i);
                break;
            }

        }

//        System.out.println( indexToRemove == -1);
        if (indexToRemove != -1) {
            // Shift elements to the left to cover the removed element
            for (int i = indexToRemove; i < cars.length - 1; i++) {    // 2 < 2 //    2+1 = 3    cars[3]    cars[1] = null
                cars[i] = cars[i + 1];

            }
            // Set the last element to null or a default value
            cars[cars.length - 1] = null; // Or any default value for non-null elements
            System.out.println("Element 'Tesla' removed from the array.");
        } else {
            System.out.println("Element 'Tesla' not found in the array.");
        }

        // Print the modified array


        System.out.print("Modified Array: ");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.print(cars[i]);
                if (i < cars.length - 1 && cars[i + 1] != null) {
                    System.out.print(", ");
                }
            }
        }


    }




}
