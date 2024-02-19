import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int D = gcd(A, B);

            sb.append(A * B / D).append('\n');
        }
        br.close();

        System.out.print(sb);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }
        return a;
    }
}