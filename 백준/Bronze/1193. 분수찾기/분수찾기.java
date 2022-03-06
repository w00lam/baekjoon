import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(bufferedReader.readLine());
        int cnt = 0; // 개수
        int n = 0; // 행 번호

        while (true) {
            n++;
            cnt += n;
            if (cnt >= X) {
                if (n % 2 == 0) {
                    System.out.println((X - cnt + n) + "/" + (cnt - X + 1));
                } else {
                    System.out.println((cnt - X + 1) + "/" + (X - cnt + n));
                }
                break;
            }
        }
    }
}