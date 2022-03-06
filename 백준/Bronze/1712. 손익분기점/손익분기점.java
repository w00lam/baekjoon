import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());
        int C = Integer.parseInt(stringTokenizer.nextToken());

        if (C <= B) {
            System.out.println("-1");
        } else {
            System.out.println(A / (C - B) + 1); // 비용과 수입이 같아지는 지점 -> N x C = A + (N x B)
        }
    }
}