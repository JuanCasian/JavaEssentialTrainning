import java.sql.SQLOutput;

public class Main {
    public static void main(String args[]){
        try {
            String welcome = "Welcome";
            char chars[] = welcome.toCharArray();
            char lastchar = chars[chars.length];
            System.out.println("Last char: " + lastchar);
        } catch (Exception e) {
            System.out.println("Found error in last code");
            e.printStackTrace();
        }

        try {
            errorMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("The code keeps running even in an error");
    }

    public static void errorMethod () throws InterruptedException {
        Thread.sleep(1000);
    }
}
