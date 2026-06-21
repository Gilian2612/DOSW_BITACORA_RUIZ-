package E06;

import java.util.Arrays;
import java.util.List;

public class PopularityStrategy implements RecommendationAlgorithm {
    @Override
    public List<String> recommend(User user) {
        return Arrays.asList("Squid Game S2", "Wednesday S2", "The Last of Us S2", "The Boys S3", "INVINCIBLE S1");
    }
    @Override
    public String toString() { return "PopularityStrategy"; }
}
