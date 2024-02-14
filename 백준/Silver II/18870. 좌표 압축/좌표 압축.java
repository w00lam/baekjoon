import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] arrSort = new int[N];
        int rank = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = arrSort[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrSort);

        for (int value : arrSort) {
            if (!rankMap.containsKey(value)) {
                rankMap.put(value, rank);
                rank++;
            }
        }

        for (int value : arr) {
            sb.append(rankMap.get(value)).append(' ');
        }
        System.out.println(sb);
    }
}