import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(string);

        if (string.contentEquals(stringBuilder.reverse())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}