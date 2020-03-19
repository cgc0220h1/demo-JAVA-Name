import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.printf("Hello: %s",name);
    }
}