import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int a[] = new int[cnt];
        int b[] = new int[cnt];
        int hap[] = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            a[i] = n;
            b[i] = m;
            hap[i] = n + m;
        }

        for (int i = 0; i < cnt; i++) {
            System.out.println("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " + hap[i]);
        }
    }
}