import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            setA.add(num);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            setB.add(num);
        }
        br.close();

        int result = 0;

        for (int number : setA) {
            if (!setB.contains(number)) {
                result++;
            }
        }
        for (int number : setB) {
            if (!setA.contains(number)) {
                result++;
            }
        }

        System.out.println(result);
    }
}