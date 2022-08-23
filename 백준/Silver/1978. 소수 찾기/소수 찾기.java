import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine(); // N은 사용되지 않음
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int count = 0;

        // StringTokenizer 자체가 토큰이 남아있는지 여부를 true, false 로 반환시켜주는 hasMoreTokens() 라는 메소드를 사용
        while (stringTokenizer.hasMoreTokens()) {
            boolean isPrime = true;
            int num = Integer.parseInt(stringTokenizer.nextToken());

            if (num == 1) {
                continue;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }

        System.out.print(count);
    }
}