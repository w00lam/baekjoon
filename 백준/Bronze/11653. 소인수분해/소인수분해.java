import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        int prime = 2;

        while (N != 1) {
            while (N % prime == 0) {
                N /= prime;
                stringBuilder.append(prime).append("\n");
            }
            prime++;
        }

        System.out.print(stringBuilder);
    }
}