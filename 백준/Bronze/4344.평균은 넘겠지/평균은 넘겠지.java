import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(bufferedReader.readLine());
        int[] arr;
        StringTokenizer stringTokenizer;

        for (int i = 0; i < c; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int n = Integer.parseInt(stringTokenizer.nextToken());

            arr = new int[n];

            double sum = 0;

            for (int j = 0; j < n; j++) {
                int score = Integer.parseInt(stringTokenizer.nextToken());
                arr[j] = score;
                sum += score;
            }

            double mean = sum / n;
            double count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] > mean) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", count / n * 100);
        }
    }
}