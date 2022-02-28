import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < t; i++) {
            String[] str = bufferedReader.readLine().split(" "); // 공백으로 입력 분리.

            int n = Integer.parseInt(str[0]); // 반복 횟수.
            String s = str[1]; // 입력한 문자열.

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(s.charAt(j));
                }
            }

            System.out.println();
        }
    }
}