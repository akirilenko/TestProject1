package Observer;

import java.util.ArrayList;

public class TimeServer implements Subscriber {

    private ArrayList<Publisher> publishers = new ArrayList<Publisher>();


    public void registerPublisher(Publisher p) {
        publishers.add(p);

    }

    public void removePublisher(Publisher p) {

        int i = publishers.indexOf(p);
        if (i >= 0) {
            publishers.remove(i);
        }
    }

    public void notifyPublishers() {
        for (int i = 0; i < publishers.size(); i++) {
            Publisher publisher = (Publisher) publishers.get(i);
            publisher.showTime();
        }
    }


}