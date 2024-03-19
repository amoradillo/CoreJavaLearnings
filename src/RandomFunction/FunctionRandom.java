package RandomFunction;

import java.util.Random;

public class FunctionRandom {
    public static void main(String[] args) {
        Random random = new Random();  // pseudorandom_numbers

//        int x = random.nextInt(6)+1;
//        double y  = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z);
    }
}
