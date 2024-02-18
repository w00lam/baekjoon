import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> poke = new HashMap<>();
        HashMap<Integer, String> dex = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int index = 1;
        for (int i = 0; i < N; i++) {
            String pokemon = br.readLine();

            poke.put(pokemon, index);
            dex.put(index, pokemon);
            index++;
        }

        for (int i = 0; i < M; i++) {
            String question = br.readLine();

            if ('9' < question.charAt(0)) {
                sb.append(poke.get(question)).append('\n');
            } else {
                sb.append(dex.get(Integer.parseInt(question))).append('\n');
            }
        }

        System.out.print(sb);
    }
}