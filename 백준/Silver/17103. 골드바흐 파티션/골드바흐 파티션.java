import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] prime = new boolean[1000001];
        prime[0] = prime[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!prime[i]) {
                for (int j = 2 * i; j <= 1000000; j += i) {
                    prime[j] = true;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 2; j <= N / 2; j++) {
                if (!prime[j] && !prime[N - j]) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}