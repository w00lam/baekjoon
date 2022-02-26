import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer; // 한 줄에 입력받은 문자열을 delim으로 분리하여 저장하면서 꺼내온다.
        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());

            if (A == 0 && B == 0) {
                break;
            }
            stringBuilder.append((A + B)).append('\n');
        }
        System.out.println(stringBuilder);
    }
}
