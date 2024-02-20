import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "1":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    bw.write((stack.empty() ? -1 : stack.pop()) + "\n");
                    break;
                case "3":
                    bw.write(stack.size() + "\n");
                    break;
                case "4":
                    bw.write((stack.empty() ? 1 : 0) + "\n");
                    break;
                case "5":
                    bw.write((stack.empty() ? -1 : stack.peek()) + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}