import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int result = 0;
        if (!stack.empty()) {
            int length = stack.size();

            for (int i = 0; i < length; i++) {
                result += stack.pop();
            }
        }
        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}