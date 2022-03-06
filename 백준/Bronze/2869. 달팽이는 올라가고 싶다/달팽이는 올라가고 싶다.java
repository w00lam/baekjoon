import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int A = Integer.parseInt(stringTokenizer.nextToken()); // 상승
        int B = Integer.parseInt(stringTokenizer.nextToken()); // 하강
        int V = Integer.parseInt(stringTokenizer.nextToken()); // 높이

        int day = (V - B) / (A - B); // 정점에 도착하면 하강하지 않음으로
        if ((V - B) % (A - B) != 0) { // 남은 높이가 존재해 다음날에 도착하게 됨으로
            day++;
        }

        System.out.println(day);
    }
}