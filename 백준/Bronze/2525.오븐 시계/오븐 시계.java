import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        h += t / 60; // 시 계산
        m += t % 60; // 분 계산

        if (m >= 60) { // 분 -> 시
            h += 1;
            m -= 60;
        }
        if (h >= 24) { // 24시간 표기 수정
            h -= 24;
        }

        System.out.println(h + " " + m);
    }
}
