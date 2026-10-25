import java.util.List;

public class CommaSeparatedListStrategy implements ListFormatStrategy {
    @Override
    public String format(List<String> items) {
        return String.join(", ", items);
    }
}
