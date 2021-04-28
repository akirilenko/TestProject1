package Observer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CurrentTime implements Publisher {

    private Subscriber timeDate;
    String calcTime;

    Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));

    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd MMM yyyy");

    public CurrentTime(Subscriber timeDate) {
        this.timeDate = timeDate;
        timeDate.registerPublisher(this);
    }

    public String showTime() {

        calcTime = sdf.format(calendar.getTime());
        System.out.println("Current time . " + calcTime);
        System.out.println();
        return calcTime;
    }

}
