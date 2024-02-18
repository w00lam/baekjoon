import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        HashMap<String, Integer> S = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < N; i++) {
            S.put(br.readLine(), 0);
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            if (S.containsKey(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}