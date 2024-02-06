import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        int result = a1 * n + a0 <= c * n && a1 <= c ? 1 : 0;

        System.out.println(result);
    }
}