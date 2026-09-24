import java.util.ArrayList;
import java.util.List;

public class FootballMatch implements Subject {
    private List<Observer> observers;
    private String teamA, teamB;
    private int scoreA, scoreB;
    private String currentMessage;

    public FootballMatch(String teamA, String teamB) {
        observers = new ArrayList<>();
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = 0;
        this.scoreB = 0;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        System.out.println(currentMessage);
        for (Observer observer : observers) {
            observer.update(currentMessage);
        }
        System.out.println();
    }

    private void matchChanged() {
        notifyObserver();
    }

    public void startMatch() {
        currentMessage = "Match started: " + teamA + " vs " + teamB;
        matchChanged();
    }

    public void scoreGoal(String team) {
        if (team.equals(teamA)) {
            scoreA++;
        } else if (team.equals(teamB)) {
            scoreB++;
        }
        currentMessage = "Goal! " + teamA + " " + scoreA + "-" + scoreB + " " + teamB;
        matchChanged();
    }

    public void endMatch() {
        currentMessage = "Match ended: " + teamA + " " + scoreA + "-" + scoreB + " " + teamB;
        matchChanged();
    }
}