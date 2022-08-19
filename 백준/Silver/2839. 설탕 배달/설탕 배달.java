import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        if (N == 4 || N == 7) {
            System.out.print(-1);
        } else if (N % 5 == 0) {
            System.out.print(N / 5);
        } else if (N % 5 == 1 || N % 5 == 3) {
            System.out.print(N / 5 + 1);
        } else if (N % 5 == 2 || N % 5 == 4) {
            System.out.print(N / 5 + 2);
        }
    }
}