import java.util.Scanner;

public class Main {

    public static void addMethod(double num1, double num2) {
        double res;
        res = num1 + num2;
        System.out.println("The result of " + num1 + " + " + num2 + " is: " + res);
    }
        public static void subMethod(double num1, double num2) {
        double res;
        res = num1 - num2;
        System.out.println("The result of " + num1 + " - " + num2 + " is: " + res);
    }
        public static void mulMethod(double num1, double num2) {
        double res;
        res = num1 * num2;
        System.out.println("The result of " + num1 + " * " + num2 + " is: " + res);
    }
        public static void divMethod(double num1, double num2) {
        double res;
        res = num1 / num2;
        System.out.println("The result of " + num1 + " / " + num2 + " is: " + res);
    }

    public static void main(String args[]){
        Double      num1, num2;
        Scanner     myscan = new Scanner(System.in);
        String      operator;

        System.out.print("Enter numerical value: ");
        num1 = Double.parseDouble(myscan.nextLine());
        System.out.print("Enter numerical value: ");
        num2 = Double.parseDouble(myscan.nextLine());
        System.out.print("Enter an operator (* / + -): ");
        operator = myscan.nextLine();

        switch (operator) {
            case "+":
                addMethod(num1, num2);
                break;
            case "-":
                subMethod(num1, num2);
                break;
            case "/":
                divMethod(num1, num2);
                break;
            case "*":
                mulMethod(num1, num2);
                break;
            default:
                System.out.println("Operator not found");
        }
    }
}
