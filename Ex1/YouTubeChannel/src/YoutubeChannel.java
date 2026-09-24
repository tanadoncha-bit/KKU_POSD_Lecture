import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = subscribers.indexOf(o);
        if (i >= 0) {
            subscribers.remove(i);
        }
    }

    @Override
    public void notifyObserver(String videoTitle) {
        for (Observer observer : subscribers) {
            observer.update(videoTitle);
        }
    }

    public void upload(String videoTitle) {
        System.out.println("New video uploaded: " + videoTitle + "\n");
        notifyObserver(videoTitle);
    }
}
