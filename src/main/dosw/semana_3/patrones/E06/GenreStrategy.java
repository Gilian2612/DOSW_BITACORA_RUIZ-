package E06;
import java.util.Arrays;
import java.util.List;
public class GenreStrategy implements RecommendationAlgorithm {
    @Override
    public List<String> recommend(User user) {
        return Arrays.asList("Fast & Furious 7", "Inception", "Interstellar", "The Matrix");
    }
    @Override
    public String toString() { return "GenreStrategy"; }
}
