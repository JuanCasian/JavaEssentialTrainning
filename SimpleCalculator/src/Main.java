import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        BigDecimal num1, num2, res;
        Scanner myscan = new Scanner(System.in);

        System.out.print("Enter numerical value: ");
        num1 = new BigDecimal(myscan.nextLine());
        System.out.print("Enter numerical value: ");
        num2 = new BigDecimal(myscan.nextLine());
        res = num1.add(num2);
        System.out.println("Result: " + res.toString());
    }
}
