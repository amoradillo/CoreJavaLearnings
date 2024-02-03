package IncrementDecrementOperators;

public class PreIncrementOperatorSample {

    int i =0;
    public PreIncrementOperatorSample(int i) {
    }

    public void printOperator()
    {
        System.out.println(this.i++);
    }

    public static void main(String[] args) {

        PreIncrementOperatorSample incrementOperatorSample = new PreIncrementOperatorSample(0);
        incrementOperatorSample.printOperator();
    }
}
