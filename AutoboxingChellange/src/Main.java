import java.lang.reflect.Array;
import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transaction) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(),
                new ArrayList<Double>(10));
        transaction.add(initialDeposit);
    }
}
public class Main {
    public static void main(String[] args) {

        Customer bob = new Customer("Bob S", 1000);
        System.out.println(bob);
        Bank bank = new Bank("SBI");
        bank.addNewCustomer("Satyam",1000);
        System.out.println(bank);

        bank.addTransaction("Satyam", -10.25);
        bank.addTransaction("Satyam", -50.05);
        bank.printStatement("Satyam");
    }
}

class Bank{

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(10);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {

        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) was't found %n", customerName);

        return null;
    }

    public void addNewCustomer(String name, double initialDeposit) {

        if (getCustomer(name) == null) {
            Customer customer = new Customer(name, initialDeposit);
            customers.add(customer);
            System.out.println("new customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount) {

        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transaction().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {

        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transaction");
        for (double d : customer.transaction()) {
            System.out.printf("$%10.2f (%s)%n",d, d < 0 ? "Debit" : "Credit");
        }
    }
}
