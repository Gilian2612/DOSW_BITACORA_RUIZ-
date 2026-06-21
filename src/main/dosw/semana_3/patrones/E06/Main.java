package E06;
public class Main {
    public static void main(String[] args) {
        System.out.println(" E06: Motor de Recomendaciones \n");
        User user = new User("William", new GenreStrategy());
        user.addObserver(new HomePageComponent());
        user.addObserver(new SuggestedListComponent());
        user.setAlgorithm(new GenreStrategy());
        user.setAlgorithm(new HistoryStrategy());
        user.setAlgorithm(new PopularityStrategy());
    }
}
