import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 1; // 겹 수(최소 루트)
        int range = 2; // 범위(최솟값 기준)

        if (N == 1) {
            System.out.println(count);
        } else {
            while (range <= N) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}