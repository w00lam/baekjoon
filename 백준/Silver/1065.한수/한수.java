import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(arithmetic_sequence(scanner.nextInt()));
        scanner.close();
    }

    public static int arithmetic_sequence(int n) {
        int cnt = 0; // 한수 갯수

        if (n < 100) {
            return n;
        } else {
            cnt = 99;
            if (n == 1000) { // 최대값이 1000이고 1000은 등차수열이 아님으로 입력받은 값을 999로 세팅
                n = 999;
            }

            for (int i = 100; i <= n; i++) {
                int a = i / 100; // 백의 자리
                int b = i / 10 % 10; // 십의 자리
                int c = i % 10; // 일의 자리

                if (a - b == b - c) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}