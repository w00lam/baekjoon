import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        List<Integer> removedNumbers = new ArrayList<>();

        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            removedNumbers.add(queue.poll());
        }

        String result = removedNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "<", ">"));

        System.out.println(result);
    }
}
