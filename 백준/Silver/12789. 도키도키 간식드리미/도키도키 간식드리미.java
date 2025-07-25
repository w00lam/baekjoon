import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        solve(s, N);
    }

    public static void solve(String s, int N) {
        StringTokenizer st = new StringTokenizer(s, " ");
        int[] line = new int[N];
        Stack<Integer> stack = new Stack<>();
        int target = 1;

        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (line[i] == target) {
                target++;
                while (!stack.isEmpty()) {
                    if (stack.peek() == target) {
                        stack.pop();
                        target++;
                    } else {
                        break;
                    }
                }
            } else {
                stack.push(line[i]);
            }
        }

        String result = stack.isEmpty() ? "Nice" : "Sad";
        System.out.println(result);
    }
}