import java.util.Date;

public class Event {
    private String      typeOfEvent;
    private Date        dateOfEvent;
    private int         numOfGuests;
    private static int  costPerGuest = 40;
    private String      eventNumber;
    private static int  nextNumber = 1;

    public Event(String itypeOfEvent){
        this.typeOfEvent = itypeOfEvent;
        this.eventNumber = itypeOfEvent.charAt(0) + " " + nextNumber;
        nextNumber++;
    }

    public Event(String itypeOfEvent, Date idateOfEvent){
        this.typeOfEvent = itypeOfEvent;
        this.dateOfEvent = idateOfEvent;
        this.eventNumber = itypeOfEvent.charAt(0) + " " + nextNumber;
        nextNumber++;
    }

    public Event(String itypeOfEvent, Date idateOfEvent, int inumOfGuests) {
        this.typeOfEvent = itypeOfEvent;
        this.dateOfEvent = idateOfEvent;
        this.numOfGuests = inumOfGuests;
        this.eventNumber = itypeOfEvent.charAt(0) + " " + nextNumber;
        nextNumber++;
    }

    public void setTypeOfEvent(String itypeOfEvent) {
        this.typeOfEvent = itypeOfEvent;
    }

    public void setDateOfEvent(Date idateOfEvent) {
        this.dateOfEvent = idateOfEvent;
    }

    public void setNumOfGuests(int inumGuest) {
        this.numOfGuests = inumGuest;
    }

    public String getTypeOfEvent() {
        return typeOfEvent;
    }

    public Date getDateOfEvent() {
        return dateOfEvent;
    }

    public int getNumOfGuests() {
        return numOfGuests;
    }

    public int calculateTotal() {
        int total;

        total = this.numOfGuests * costPerGuest;
        return (total);
    }

    public void printEvent() {
        System.out.println("Event type: " + this.getTypeOfEvent() + "\nEvent date: " + this.getDateOfEvent() +
                "\nNumber of guests: " + this.getNumOfGuests() + "\nEvent ID: " + this.eventNumber +
                "\nTotal Costs: $" + this.calculateTotal());
    }
}
