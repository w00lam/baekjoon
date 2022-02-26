import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (M < 45) { // 45분 빠르게 맞춰줘야함으로 입력값이 45분 보다 작으면 시간과 분을 따로 계산해준다.
            H--;
            M = 60 + M - 45;
            if (H < 0) {
                H = 23;
            }

            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}
