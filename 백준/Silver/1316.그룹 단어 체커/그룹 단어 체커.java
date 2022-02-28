import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());
        int cnt = 0;

        for (int i = 0; i < t; i++) {
            String s = bufferedReader.readLine();
            boolean[] check = new boolean[26]; // 사용한 문자 확인.
            boolean tmp = true; // 그룹 단어.

            for (int j = 0; j < s.length(); j++) {
                int index = s.charAt(j) - 'a';
                if (check[index]) { // 사용한 문자라면
                    if (s.charAt(j) != s.charAt(j - 1)) { // 이전 문자와 연속하지 않는다면
                        tmp = false;
                        break;
                    }
                } else {
                    check[index] = true;
                }
            }

            if (tmp) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}