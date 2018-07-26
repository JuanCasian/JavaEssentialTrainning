import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        System.out.println("Array example");
        int[] arr = {15, 33, 59, 5};
        for (int value: arr) {
            System.out.println(value);
        }
        System.out.println("The problem is that they are fixed");


        System.out.println("List Example");
        List<String> mylist = new ArrayList<>();
        mylist.add("Hello");
        mylist.add("World");
        mylist.add("!");
        mylist.add("I was added at last without planning");
        for (String info: mylist) {
            System.out.println(info);
        }
        System.out.println("Lists let you add undefinded number of elements but you still search by index");

        System.out.println("Maps example:");
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Juan", "Casian");
        myMap.put("Renato", "Sandoval");
        myMap.put("Diego", "Villa");
        System.out.println("Maps work by looking into the key and returning your value\nI am going to look for Diego");
        System.out.println(myMap.get("Diego"));
    }
}
