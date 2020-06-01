package managementsys;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Saqlain
 */
public class Event implements Serializable{
    private String eventName,eventDate;
    
    void setEventDate(String eventDate){
        this.eventDate = eventDate;
    }
    void setEventName(String name){
        eventName = name;
    }
    String getEventName(){
        return eventName;
    }
    String getEventDate(){
        return eventDate;
    }
    
    Event(String name, String date) throws ParseException{
        eventName = name;
        eventDate = date;
    }
    Event(){}
    
}
