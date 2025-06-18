import java.util.*;

public class CollectionList {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Surat");
        cities.add("Ahmedabad");
        cities.add("Surat");  // allows duplicates

        cities.add(1, "Rajkot");  // insert at index

        System.out.println(cities);  // [Surat, Rajkot, Ahmedabad, Surat]
        System.out.println("2nd city: " + cities.get(1));  // Rajkot

        LinkedList<String> queue = new LinkedList<>();

        queue.add("Task1");
        queue.addFirst("Task0");
        queue.addLast("Task2");

        System.out.println(queue);  // [Task0, Task1, Task2]

        List<Integer> ids = new Vector<>();
        ids.add(101);
        ids.add(102);
        ids.add(103);

        System.out.println(ids);  // [101, 102, 103]

        Stack<String> browser = new Stack<>();

        browser.push("Home");
        browser.push("About");
        browser.push("Contact");

        System.out.println(browser.pop());  // Contact
        System.out.println(browser.peek()); // About

    }
}
