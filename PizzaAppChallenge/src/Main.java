import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String res;
        Scanner scanner = new Scanner(System.in);
        Pizza pizza;

        System.out.println("Welcome to your pizza store!");
        while (true){
            System.out.println("Please enter you pizza type (Sicilian / Regular):");
            res = scanner.nextLine();
            if (res.equalsIgnoreCase("Regular")) {
                pizza = new Regular();
                break;
            } else if (res.equalsIgnoreCase("Sicilian")) {
                pizza = new Sicilian();
                break;
            } else
                System.out.println("Input not accepted try again");
        }

        System.out.println("You total is: " + pizza.getCost());
    }
}
