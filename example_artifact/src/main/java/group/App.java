package group;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String name = "Alice";
        int age = 25;
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        System.out.println("\nCounting to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
