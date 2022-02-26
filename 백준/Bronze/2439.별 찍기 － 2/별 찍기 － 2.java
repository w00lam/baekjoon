import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();

        for (int i = 1; i <= cnt; i++) {
            for (int k = i; k < cnt; k++) { // 전체 줄(cnt) - 현재 줄(i)만큼 공백 출력 해주기.
                System.out.printf(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
