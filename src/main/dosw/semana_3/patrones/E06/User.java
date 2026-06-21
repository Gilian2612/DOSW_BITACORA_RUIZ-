package E06;
import java.util.ArrayList;
import java.util.List;
public class User {
    private String name;
    private RecommendationAlgorithm algorithm;
    private List<PreferenceObserver> observers = new ArrayList<>();
    public User(String name, RecommendationAlgorithm algorithm) {
        this.name = name;
        this.algorithm = algorithm;
    }
    public void addObserver(PreferenceObserver observer) {
        observers.add(observer);
    }
    public void setAlgorithm(RecommendationAlgorithm algorithm) {
        this.algorithm = algorithm;
        System.out.println("\n>> " + name + " cambio preferencias a: " + algorithm);
        notifyObservers();
    }
    private void notifyObservers() {
        for (PreferenceObserver observer : observers) {
            observer.onPreferenceChanged(this);
        }
    }
    public String getName() { return name; }
    public RecommendationAlgorithm getAlgorithm() { return algorithm; }
}
