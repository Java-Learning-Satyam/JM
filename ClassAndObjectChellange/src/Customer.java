public class Customer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public Customer(){
        this("Bob", 150, "bob@gmail.com");
        System.out.println("Inside no args");
    }

    public Customer(String name,String emailAddress){
        this(name,100,emailAddress);
        System.out.println("Inside 2 arg one");
    }

    public Customer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
