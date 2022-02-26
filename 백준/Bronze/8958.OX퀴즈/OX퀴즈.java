import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String arr[] = new String[scanner.nextInt()]; // 테스트 케이스 개수 지정.

        for (int i = 0; i < arr.length; i++) { // 테스트 케이스 생성.
            arr[i] = scanner.next();
        }

        scanner.close();

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0; // 연속되는 'O'의 개수
            int sum = 0; // 총 점수

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }

            System.out.println(sum);
        }
    }
}
