import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int n = scanner.nextInt();
        int list[] = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            list[i] = scanner.nextInt();
        }

        for (int i = 0; i < cnt; i++) {
            if (list[i] < n) {
                System.out.print(list[i] + " ");
            }
        }
    }
}