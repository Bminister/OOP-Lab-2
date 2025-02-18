import java.time.LocalDateTime;

public class EventPlanner {
    public static void addDefaultEvents(EventListPanel event)
    {
        //add some default events to the eventListPanel

        //one Deadline to add so something shows up even if you didn't add anything new
        LocalDateTime deadline = LocalDateTime.of(2024, 12, 7, 17, 0);
        Deadline firstDeadline = new Deadline("First Deadline", deadline.minusDays(20) );


        //one Meeting to add so something shows up even if you didn't add anything new
        LocalDateTime start = LocalDateTime.of(2024, 10, 7, 15, 0);
        LocalDateTime end = LocalDateTime.of(2024, 10, 7, 16, 0);
        String location = "MCS 321";
        Meeting firstMeeting = new Meeting("First Meeting", start, end, location);
    }
}
