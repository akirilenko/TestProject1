package Observer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TorontoTime implements Publisher {
    private Subscriber timeDate;
    String calcTime;

    Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
    DateFormat sdf = new SimpleDateFormat("HH:mm:ss dd MMM yyyy");

    public TorontoTime(Subscriber timeDate) {
        this.timeDate = timeDate;
        timeDate.registerPublisher(this);
    }

    public String showTime() {
        sdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        calcTime = sdf.format(calendar.getTime());
        System.out.println("Toronto time. " + calcTime);
        return calcTime;
    }
}
