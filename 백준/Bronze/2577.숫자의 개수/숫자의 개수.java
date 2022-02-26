import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() * scanner.nextInt() * scanner.nextInt();
        scanner.close();

        String str = Integer.toString(n);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}