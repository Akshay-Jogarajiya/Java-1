import java.util.*;

public class CollectionMap {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();

        users.put(101, "Akshay");
        users.put(102, "Neha");
        users.put(101, "Ravi");  // Replaces Akshay

        users.put(null, "Admin");
        users.put(103, null);

        System.out.println(users);  // {null=Admin, 101=Ravi, 102=Neha, 103=null}

        Map<String, Integer> orders = new LinkedHashMap<>();

        orders.put("Pizza", 2);
        orders.put("Burger", 1);
        orders.put("Coffee", 3);

        System.out.println(orders);  // {Pizza=2, Burger=1, Coffee=3}

        TreeMap<String, String> dictionary = new TreeMap<>();

        dictionary.put("banana", "a fruit");
        dictionary.put("apple", "another fruit");
        dictionary.put("cherry", "red fruit");

        System.out.println(dictionary);  // Sorted by key

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "One");
        table.put(2, "Two");
        // table.put(null, "Null");  //  throws error

        System.out.println(table);  // {1=One, 2=Two}
    }
}
