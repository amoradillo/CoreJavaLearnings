package VariablesDataTypes;

public class Variables {

    // data type |  size    |  primitive/reference |  value
    // boolean   |  1 bit   |  primitive           |  true or false
    // byte      |  1 byte  |  primitive           |  -128  to 127
    // short     |  2 bytes |  primitive           | -32,768 to 32,767
    // int       |  4 bytes |  primitive           | -2 billions to 2 billion
    // long      |  8 bytes |  primitive           | -9 quintillion to 9 quintillion
    // float     |  4 bytes |  primitive           | fractional number to 6-7 digits ex. 3.14592f
    // double    |  8 bytes |  primitive           | fractional number up to 15 digits ex. 3.14592653589793
    // char      |  2 bytes |  primitive           | single character/letter/ASCII value ex. 'f'
    // String    |  2 bytes |  references          | a sequence of characters ex. "Hello World!"

    // Primitive-   8 types(boolean, byte, etc.)|  stores data       |  can only hold 1 value         | less memory | fast
    // References - unlimited(user defined)     |  stores an address |  could hold more than 1 values | more memory | slower


    public static void main(String[] args) {

//        int x;  // declaration
//        x = 123;  // assignment
//        int x =123; // declaration + assignment =  INITIALIZATION
        int x = 123;
        double y = 3.14;
        boolean z = false;
        char symbol = '@';
        String name = "Bro";

        System.out.println(x);  // 123
        System.out.println("x"); // String x
        System.out.println("My number is " + x);  // My number is 123
        System.out.println(z);  // My number is 123
        System.out.println(symbol);  // My number is 123
        System.out.println("Hello" +name);  // My number is 123


    }

}
