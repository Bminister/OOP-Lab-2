import java.time.Duration;
import java.time.LocalDateTime;

public class Meeting extends Event implements Completable {
    LocalDateTime endDateTime; //The time the meeting is over.
    String location; //represents the location of the event
    Boolean complete; //represents if the meeting is complete or not

    //Constructor
    public Meeting(String name, LocalDateTime start, LocalDateTime end, String location) {
        super.name = name; //From Event class extension
        super.dateTime = start; // From Event class extension
        this.endDateTime = end;
        this.location = location;
    }

    //These are for our (implements completable) "contract"
        //Sets the complete boolean to true (setter for complete (always true if this is called))
    public void complete(){
        this.complete = true;
    }
        //returns the complete boolean (Getter for complete)
    public boolean isComplete(){
        return this.complete;
    }

    //Setters and Getters for our local instance variables
    public LocalDateTime getEndDateTime() {return endDateTime;}
    public String getLocation() {return location;}
    public void setEndDateTime(LocalDateTime end) {this.endDateTime = end;}
    public void setLocation(String location) {this.location = location;}
        //Returns the duration of the meeting (dateTime - endDateTime)
    public Duration getDuration(){
        return Duration.between(dateTime, endDateTime);
    }
}
