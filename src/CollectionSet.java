import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");  // Duplicate ignored
        fruits.add(null);     // One null allowed

        System.out.println(fruits);  // [null, Banana, Apple] → order not guaranteed

        Set<String> items = new LinkedHashSet<>();

        items.add("Keyboard");
        items.add("Mouse");
        items.add("Monitor");
        items.add("Keyboard");  // Ignored

        System.out.println(items);  // [Keyboard, Mouse, Monitor]

        Set<Integer> marks = new TreeSet<>();

        marks.add(90);
        marks.add(75);
        marks.add(95);
        // marks.add(null);  // ❌ Throws NullPointerException

        System.out.println(marks);  // [75, 90, 95] → sorted
    }
}
