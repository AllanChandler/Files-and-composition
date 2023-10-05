import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Cafe {

    ArrayList<String> coffeeMenu = new ArrayList<>();

    public void coffeeMenu() {
        coffeeMenu.add("Expresso");
        coffeeMenu.add("Americano");
        coffeeMenu.add("Macchiato");
        coffeeMenu.add("Flat White");
        coffeeMenu.add("Latte");
    }


        public void loadMenuData() {
            File file = new File("src/coffees.txt");

            try {
                Scanner scan = new Scanner(file);

                while (scan.hasNextLine()) {
                    coffeeMenu.add(scan.nextLine());
                }

            } catch (FileNotFoundException e) {

                System.out.println("File not found. Check path and filename");


            }
        }

}







