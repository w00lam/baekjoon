import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        BigInteger A = new BigInteger(stringTokenizer.nextToken());
        BigInteger B = new BigInteger(stringTokenizer.nextToken());

        A = A.add(B);

        System.out.print(A);
    }
}