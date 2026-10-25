import java.util.Arrays;
import java.util.List;

public class ExtensionDemo {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Milk", "Bread", "Apples");
        ShoppingListFormatter formatter = new ShoppingListFormatter(new CommaSeparatedListStrategy());

        System.out.println("Comma-separated list:");
        System.out.println(formatter.format(items));

        formatter.setStrategy(new CheckboxListStrategy());
        System.out.println("\nCheckbox list:");
        System.out.println(formatter.format(items));
    }
}
