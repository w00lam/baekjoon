import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            if (n % b < 10) {
                sb.append((char) (n % b + '0'));
            } else {
                sb.append((char) (n % b - 10 + 'A'));
            }
            n /= b;
        }

        System.out.println(sb.reverse());
    }
}