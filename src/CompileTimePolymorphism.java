public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Addition addition = new Addition();

        System.out.println(addition.add(5, 10));
        System.out.println(addition.add(5, 10, 15));
        System.out.println(addition.add("Akshay", "Jogarajiya"));
    }
}
class Addition {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public String add(String a, String b) {
        return a + " " +b;
    }
}
