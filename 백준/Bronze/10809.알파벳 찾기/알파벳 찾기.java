import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; // 출력 배열 초기화.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String s = bufferedReader.readLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (arr[c - 'a'] == -1) { // 처음 등장했을때만 위치 입력.
                arr[c - 'a'] = i;
            }
        }

        for (int index : arr) {
            System.out.print(index + " ");
        }
    }
}