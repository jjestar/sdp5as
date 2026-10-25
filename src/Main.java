import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Milk", "Bread", "Apples");
        ShoppingListFormatter formatter = new ShoppingListFormatter(new BulletListStrategy());

        System.out.println("Bullet list:");
        System.out.println(formatter.format(items));

        formatter.setStrategy(new NumberedListStrategy());
        System.out.println("\nNumbered list:");
        System.out.println(formatter.format(items));

        formatter.setStrategy(new CommaSeparatedListStrategy());
        System.out.println("\nComma-separated list:");
        System.out.println(formatter.format(items));
    }
}
