import java.util.List;
import java.util.StringJoiner;

public class NumberedListStrategy implements ListFormatStrategy {
    @Override
    public String format(List<String> items) {
        StringJoiner result = new StringJoiner("\n");
        for (int i = 0; i < items.size(); i++) {
            result.add((i + 1) + ". " + items.get(i));
        }
        return result.toString();
    }
}
