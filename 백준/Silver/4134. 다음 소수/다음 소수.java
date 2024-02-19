import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());
            BigInteger bi = new BigInteger(String.valueOf(n));
            if (bi.isProbablePrime(10)) {
                bw.write(bi + "\n");
            } else {
                bw.write(bi.nextProbablePrime() + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}