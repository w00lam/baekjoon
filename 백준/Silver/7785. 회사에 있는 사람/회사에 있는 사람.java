import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> recodes = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            if (recodes.containsKey(name)) {
                recodes.remove(name);
            } else {
                recodes.put(name, state);
            }
        }

        ArrayList<String> result = new ArrayList<>(recodes.keySet());
        result.sort(Collections.reverseOrder());

        for (String name : result) {
            System.out.println(name);
        }
    }
}