import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean dorm;
        double stayDuration, weeklyExpenses, costOfRoom, costOfSupplies, numCredits, costPerCredit, result;
        String name, year;

        name = setName();
        year = setYear();
        costOfSupplies = setCostOfSupplies();
        numCredits = setNumOfCredits();
        costPerCredit = setCostPerCredit();
        dorm  = setDorm();
        if (dorm == true){
            stayDuration = setStayDuration();
            weeklyExpenses = setWeeklyExpenses();
            costOfRoom = setCostOfRoom();
        } else {
            stayDuration = 0;
            weeklyExpenses = 0;
            costOfRoom = 0;
        }
        result = costOfSupplies + (numCredits * costPerCredit) + (stayDuration * weeklyExpenses) +
                (stayDuration * costOfRoom / 4);
        System.out.println("The cost of room for:\n" + name + "\nYear: " + year + "\nare: $" + result);



    }

    public static String setName(){
        Scanner myScan = new Scanner(System.in);
        String ans;
        System.out.println("What is your name?");
        ans = myScan.nextLine();
        return (ans);
    }

    public static String setYear(){
        Scanner myScan = new Scanner(System.in);
        String ans;
        System.out.println("What year are you into (Freshman, sophmore, etc)?");
        ans = myScan.nextLine();
        return (ans);
    }

    public static double setCostPerCredit(){
        Scanner myScan = new Scanner(System.in);
        double ans = 0;
        System.out.println("How much do you pay for each credit?");
        try {
            ans = Double.parseDouble(myScan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You didn't entered pure numbers");
            System.exit(-1);
        }
        if (ans > 0) {
            return (ans);
        } else {
            System.out.println("Answer not permited, try again");
            return (setStayDuration());
        }
    }

    public static double setNumOfCredits(){
        Scanner myScan = new Scanner(System.in);
        double ans = 0;
        System.out.println("How many credits are you validating?");
        try {
            ans = Double.parseDouble(myScan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You didn't entered pure numbers");
            System.exit(-1);
        }
        if (ans > 0) {
            return (ans);
        } else {
            System.out.println("Answer not permited, try again");
            return (setStayDuration());
        }
    }

    public static double setCostOfSupplies(){
        Scanner myScan = new Scanner(System.in);
        double ans = 0;
        System.out.println("How much did you spend in supplies?");
        try {
            ans = Double.parseDouble(myScan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You didn't entered pure numbers");
            System.exit(-1);
        }
        if (ans > 0) {
            return (ans);
        } else {
            System.out.println("Answer not permited, try again");
            return (setStayDuration());
        }
    }

    public static boolean setDorm(){
        Scanner myScan = new Scanner(System.in);
        String ans;
        System.out.println("Are you staying in dorms? (y/n)");
        ans = myScan.nextLine();
        if (ans.equals("y")) {
            return (true);
        } else if (ans.equals("n")){
            return (false);
        } else {
            System.out.println("Answer not permited, try again");
            return (setDorm());
        }
    }

    public static double setStayDuration(){
        Scanner myScan = new Scanner(System.in);
        double ans = 0;
        System.out.println("How long are you staying in dorms?");
        try {
            ans = Double.parseDouble(myScan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You didn't entered pure numbers");
            System.exit(-1);
        }
        if (ans > 0) {
            return (ans);
        } else {
            System.out.println("Answer not permited, try again");
            return (setStayDuration());
        }
    }

    public static double setWeeklyExpenses(){
        Scanner myScan = new Scanner(System.in);
        double ans = 0;
        System.out.println("How much do you spend at the dorms?");
        try {
            ans = Double.parseDouble(myScan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You didn't entered pure numbers");
            System.exit(-1);
        }
        if (ans > 0) {
            return (ans);
        } else {
            System.out.println("Answer not permited, try again");
            return (setStayDuration());
        }
    }

    public static double setCostOfRoom(){
        Scanner myScan = new Scanner(System.in);
        double ans = 0;
        System.out.println("How much do you pay for the dorm?");
        try {
            ans = Double.parseDouble(myScan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You didn't entered pure numbers");
            System.exit(-1);
        }
        if (ans > 0) {
            return (ans);
        } else {
            System.out.println("Answer not permited, try again");
            return (setStayDuration());
        }
    }


}
