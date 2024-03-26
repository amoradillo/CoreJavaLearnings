package Experiment;

public class Test1 {

    private String a;
    private String b;

    public Test1(String a, String b)
    {
           this.a = a;
           this.b = b;
    }


    public Test1 login()
    {
        System.out.println("test");
        return new Test1(a,b);
    }




}
