import java.time.LocalDateTime;

public class Deadline extends Event implements Completable{
    //Instance Variable
    boolean complete; // holds value if the task this deadline tracks is complete

    //Constructor
    public Deadline(String name, LocalDateTime deadline) {
        super.name = name;
        super.dateTime = deadline;
    }

    //Sets the complete boolean to true
    public void complete(){
        this.complete = true;
    }

    //returns the complete boolean (aka getter for the complete instance variable)
    public boolean isComplete(){
        return this.complete;
    }

}
