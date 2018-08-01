package findname;
import java.util.*;

/**
 *
 * @author Peggy Fisher
 */
public class FindName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] names = {{"Mickey", "Mouse"},
            {"Donald", "Duck"},
            {"Goofy", "Pluto"},
            {"Snow", "White"},
            {"James", "Bond"},
            {"Doc", "Sneezy"},
            {"Scotty", "Jimmy"},
            {"Peggy", "Sandy"},
            {"Joe", "Sean"},
            {"Alice", "Mackenzie"},
            {"Reshmi", "Vasant"},
            {"Steve", "Rae"}};

        String userAns;
        Scanner scan = new Scanner(System.in);
        boolean i;
        i = true;
        System.out.println("Welcome to the guessing name game. " +
                "All you need to do is enter a name and see if you guessed it correctly!");
        while (i) {
            System.out.print("Please enter your guess: ");
            userAns = scan.nextLine();
            for (String[] nameArr : names) {
                for (String name : nameArr) {
                    if (userAns.equalsIgnoreCase(name)) {
                        System.out.println("Congratulations you guessed correctly!");
                        System.exit(-1);
                    }
                }
            }
            System.out.println("I am sorry your guess was incorrect!");
            System.out.print("Do you want to play again? (y/n) ");
            userAns = scan.nextLine();
            if (userAns.equalsIgnoreCase("n")) {
                i = false;
            }
        }
        }
    }
    

