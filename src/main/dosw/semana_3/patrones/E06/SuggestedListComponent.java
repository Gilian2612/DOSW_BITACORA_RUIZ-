package E06;
public class SuggestedListComponent implements PreferenceObserver {
    @Override
    public void onPreferenceChanged(User user) {
        System.out.println("  [Sugeridos] Lista actualizada: " + user.getAlgorithm().recommend(user));
    }
}
