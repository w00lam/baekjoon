import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println("long ".repeat(Math.max(0, n / 4)) + "int");
    }
}
