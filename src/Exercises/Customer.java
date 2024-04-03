package Exercises;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer()
    {
        this("Jremy",500.0, "jremy@gmail.com");
    }

    public Customer(String name, String emailAddress)
    {
        this.name = name;
        this.emailAddress = emailAddress;
    }
    public Customer(String name, double creditLimit, String emailAddress)
    {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args)
    {

        Customer customer1 = new Customer("Ave", 995.5,"avejay.moradillo@gmail.com");
        System.out.println(customer1.getName());
        Customer customer2 = new Customer("Jessie", "jessie.moradillo@gmail.com");
        System.out.println(customer2.getName());
        Customer customer3 = new Customer();
        System.out.println(customer3.getName() + " " + customer3.getCreditLimit());
    }
}
