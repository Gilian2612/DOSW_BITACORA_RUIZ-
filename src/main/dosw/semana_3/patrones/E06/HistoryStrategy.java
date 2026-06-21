package E06;
import java.util.Arrays;
import java.util.List;
public class HistoryStrategy implements RecommendationAlgorithm {
    @Override
    public List<String> recommend(User user) {
        return Arrays.asList("Breaking Bad S5", "Dark S3", "Stranger Things S4", "Mr Inbetween S1");
    }
    @Override
    public String toString() { return "HistoryStrategy"; }
}
