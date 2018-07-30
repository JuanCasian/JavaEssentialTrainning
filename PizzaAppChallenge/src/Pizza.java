import java.util.Scanner;

public  abstract class Pizza implements Comparable {
    private String      size;
    private String[]    toppings;
    private double      cost;
    private String      type;

    public Pizza(double cost, String type) {
        this.cost = cost;
        this.type = type;
        this.size = this.getSize();
        this.toppings = this.setToppings();
    }

    public double getCost() {
        return cost;
    }

    public String[] setToppings()
    {
        int max;
        String[] toppings;
        Scanner scanner = new Scanner(System.in);
        String current;

        if (this.type.equalsIgnoreCase("sicilian"))
            max = 2;
        else
            max = 4;
        toppings = new String[max];
        System.out.println("Enter your toppings or input 'q' when done: ");
        for (int i = 0; i < max; i++) {
            current = scanner.nextLine();
            if (current.equalsIgnoreCase("q"))
                break;
            else
                toppings[i] = current;
        }
        return toppings;
    }

    public String getSize(){
        Scanner scanner = new Scanner(System.in);
        String size;
        System.out.println("Enter your pizza size (S, M, L, XL): ");
        size = scanner.nextLine();
        switch (size) {
            case "S":
                return size;
            case "M":
                return size;
            case "L":
                return size;
            case "XL":
                return size;
            default:
                System.out.println("Input not valid try again.");
                return (this.getSize());
        }
    }

    @Override
    public int compareTo(Object o) {
        Pizza pizza = (Pizza)o;
        int p1;
        int p2;

        p1 = this.sizeToInt();
        p2 = pizza.sizeToInt();

        if (p1 > p2)
            return (1);
        else if (p1 < p2)
            return (-1);
        else
            return (0);
    }

    public int sizeToInt() {
        switch (this.size) {
            case "S":
                return (0);
            case "M":
                return (1);
            case "L":
                return (2);
            case "XL":
                return (3);
            default:
                return (-1);
        }
    }
}
