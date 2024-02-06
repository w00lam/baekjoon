import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();
        int[] arr = new int[10];

        for (int i = 0; i < N.length(); i++) {
            arr[(int) N.charAt(i) - '0']++;
        }

        for (int i = 9; i > -1; i--) {
            while (arr[i] > 0) {
                sb.append(i);
                arr[i]--;
            }
        }

        System.out.println(sb);
    }
}