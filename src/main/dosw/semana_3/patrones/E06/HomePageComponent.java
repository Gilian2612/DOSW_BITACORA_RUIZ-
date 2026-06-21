package E06;
public class HomePageComponent implements PreferenceObserver {
    @Override
    public void onPreferenceChanged(User user) {
        System.out.println("  [HomePage] Actualizando con algoritmo: " + user.getAlgorithm());
        System.out.println("  [HomePage] Contenido: " + user.getAlgorithm().recommend(user));
    }
}
