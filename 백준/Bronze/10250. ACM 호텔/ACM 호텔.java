import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine()); // 테스트 개수

        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int H = Integer.parseInt(stringTokenizer.nextToken()); // H층 건물
            stringTokenizer.nextToken(); // 각 층에 W개의 방
            int N = Integer.parseInt(stringTokenizer.nextToken()); // N번째 손님

            if (N % H == 0) {
                stringBuilder.append((H * 100) + (N / H)).append("\n");
            } else {
                stringBuilder.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
            }
        }

        System.out.println(stringBuilder);
    }
}