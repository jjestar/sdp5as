import java.util.List;

public class ShoppingListFormatter {
    private ListFormatStrategy strategy;

    public ShoppingListFormatter(ListFormatStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ListFormatStrategy strategy) {
        this.strategy = strategy;
    }

    public String format(List<String> items) {
        return strategy.format(items);
    }
}
