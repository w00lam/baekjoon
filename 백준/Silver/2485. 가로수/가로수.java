import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;
        for (int i = 0; i < N - 1; i++) {
            int gap = arr[i + 1] - arr[i];
            gcd = GCD(gcd, gap);
        }

        int result = 0;
        for (int i = 0; i < N - 1; i++) {
            int gap = arr[i + 1] - arr[i];
            result += gap / gcd - 1;
        }

        System.out.println(result);
    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}