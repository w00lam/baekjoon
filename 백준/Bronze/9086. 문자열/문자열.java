import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            stringBuilder.append(s.charAt(0)).append(s.charAt(s.length() - 1)).append("\n");
        }

        System.out.println(stringBuilder);
    }
}
