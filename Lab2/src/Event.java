import java.time.LocalDateTime;

abstract class Event implements Comparable<Event> {
    //Instance Variables
    public String name; //name of the event
    public LocalDateTime dateTime; //the time and date the event starts

    //Constructor
    public Event(String name,LocalDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }
    //Setters and Getters for Variables
    public String getName() {return name;}
    public LocalDateTime getDateTime() {return dateTime;}
    public void setName(String name) {this.name = name;}
    public void setDateTime(LocalDateTime dateTime) {this.dateTime = dateTime;}



    //Compares the date of this event to the incoming event and returns
    // a positive int if this event comes later,
    // a negative int if this event comes before, and
    // a zero if the two have the same dateTime.
    @Override
    public int compareTo(Event o) {
        if (this.dateTime.isAfter(o.getDateTime()))
            return 1;
        else if (this.dateTime.isBefore(o.getDateTime()))
            return -1;
        else // these are the same date
            return 0;
    }
}
