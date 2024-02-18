import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> deck = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        for (int card : list) {
            if (!deck.containsKey(card)) {
                deck.put(card, 1);
            } else {
                int num = deck.get(card) + 1;
                deck.put(card, num);
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] hand = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            hand[i] = Integer.parseInt(st.nextToken());
        }
        for (int card : hand) {
            if (deck.containsKey(card)) {
                sb.append(deck.get(card)).append(' ');
            } else {
                sb.append(0).append(' ');
            }
        }
        br.close();

        System.out.println(sb);
    }
}