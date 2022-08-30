import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        stringBuilder.append((int) Math.pow(2, N) - 1).append('\n');

        Hanoi(N, 1, 2, 3);

        System.out.print(stringBuilder);
    }

    /*
        N : 원판의 개수
        start : 출발
        mid : 경유
        to : 목적지
     */
    public static void Hanoi(int N, int start, int mid, int to) {
        if (N == 1) {
            stringBuilder.append(start + " " + to + "\n");
            return;
        }

        // A -> B로 N-1개를 이동
        Hanoi(N - 1, start, to, mid);

        // A -> C로 1개를 이동
        stringBuilder.append(start + " " + to + "\n");

        // B -> C로 N-1개를 이동
        Hanoi(N - 1, mid, start, to);
    }
}