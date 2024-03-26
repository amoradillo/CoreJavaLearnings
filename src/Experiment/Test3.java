package Experiment;

public class Test3 {
    public static void main(String[] args)
    {
        reverseString("tres");

    }


    public static void reverseString(String word)
    {
        String temp = "";

        for(int i=word.length()-1; i >= 0; i--)
        {
             temp = temp + word.charAt(i);
        }

        System.out.println(temp);

    }
}
