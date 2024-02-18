import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> noListen = new HashSet<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            noListen.add(name);
        }

        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (noListen.contains(name)) {
                nameList.add(name);
            }
        }
        br.close();

        Collections.sort(nameList);

        System.out.println(nameList.size());
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
