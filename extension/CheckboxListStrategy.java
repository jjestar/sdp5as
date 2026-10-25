import java.util.List;
import java.util.StringJoiner;

public class CheckboxListStrategy implements ListFormatStrategy {
    @Override
    public String format(List<String> items) {
        StringJoiner result = new StringJoiner("\n");
        for (String item : items) {
            result.add("[ ] " + item);
        }
        return result.toString();
    }
}
