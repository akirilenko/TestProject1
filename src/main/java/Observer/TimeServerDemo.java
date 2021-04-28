package Observer;

public class TimeServerDemo {

    public static void main(String[] args) throws InterruptedException {

        TimeServer timeServer = new TimeServer();
        TorontoTime torontoTime = new TorontoTime(timeServer);

        CurrentTime currentTime1 = new CurrentTime(timeServer);

        timeServer.registerPublisher(currentTime1);
        timeServer.registerPublisher(torontoTime);

        for (int i=0;i<10;i++) {
            timeServer.notifyPublishers();
            Thread. sleep (2000);
        }

    }

}
