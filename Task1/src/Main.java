import java.util.ArrayList;

public class Main {

    private static final ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        customers.add(new Customer("Allan", "Chandler","AC",1));
        customers.add(new Customer("Peter", "Andersen","PA",2));
        customers.add(new Customer("Kalle", "Hansen","KH",3));
        customers.add(new Customer("Alexander", "Bengsten","AB",4));

        printCostumers();
    }

    public static void printCostumers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}