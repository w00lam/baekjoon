import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(bufferedReader.readLine());
            if (n == 0) {
                break;
            }

            int count = 0;

            for (int i = n + 1; i <= 2 * n; i++) {
                boolean isPrime = true;
                if (i == 1) {
                    continue;
                }
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }

            stringBuilder.append(count).append("\n");
        }

        System.out.print(stringBuilder);
    }
}