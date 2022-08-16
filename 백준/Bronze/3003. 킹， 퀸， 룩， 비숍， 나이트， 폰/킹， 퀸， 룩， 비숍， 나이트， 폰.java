import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        int[] piece = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < piece.length; i++) {
            int n = Integer.parseInt(stringTokenizer.nextToken());
            stringBuilder.append(piece[i] - n + " ");
        }

        System.out.print(stringBuilder);
    }
}