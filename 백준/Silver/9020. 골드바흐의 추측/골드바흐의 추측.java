import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        get_prime();

        int T = Integer.parseInt(bufferedReader.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(bufferedReader.readLine()); // n = p + q
            int p = n / 2;
            int q = n / 2;

            while (true) {
                if (!prime[p] && !prime[q]) {
                    stringBuilder.append(p).append(' ').append(q).append('\n');
                    break;
                }
                p--;
                q++;
            }
        }

        System.out.print(stringBuilder);
    }

    /*
        에라토스테네스의 체
        false : 소수
        range : 0 ~ 10000
     */
    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}