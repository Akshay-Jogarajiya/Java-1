import java.util.*;

public class Array   {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1};

        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        int[] copied = Arrays.copyOf(arr, 6);
        Arrays.fill(copied, 4, 6, 0); // fill index 4 and 5 with 0
        System.out.println("Copied: " + Arrays.toString(copied));

        System.out.println("Binary Search for 5: " + Arrays.binarySearch(arr, 5));
        System.out.println("Equals: " + Arrays.equals(arr, new int[]{1, 2, 5, 9}));
    }
}
