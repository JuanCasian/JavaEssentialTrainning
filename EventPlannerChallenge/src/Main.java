import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Event e1;
        Event e2;
        Event e3;

        try {
            e1 = createEvent();
            e2 = createEvent();
            e3 = createEvent();
            printEvents(e1, e2, e3);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Error while parsing");
            System.exit(-1);
        }

    }

    public static Event createEvent() throws ParseException {
        String  typeOfEvent;
        String  date;
        Date    dateOfEvent;
        int     numOfGuests;
        Event   event;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of event: ");
        typeOfEvent = scanner.nextLine();
        System.out.print("Enter date in (dd/MM/yyyy) format: ");
        date = scanner.nextLine();
        dateOfEvent = new SimpleDateFormat("dd/MM/yyy").parse(date);
        System.out.print("Enter number of guests: ");
        numOfGuests = Integer.parseInt(scanner.next());
        event = new Event(typeOfEvent, dateOfEvent, numOfGuests);
        return (event);
    }

    public static void printEvents(Event ... events){
        for (Event e: events) {
            e.printEvent();
        }
    }
}
