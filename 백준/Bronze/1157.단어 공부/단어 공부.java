import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String s = bufferedReader.readLine().toUpperCase(Locale.ROOT);

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }

        int max = 0;
        char c = ' ';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                c = (char) ('A' + i);
            } else if (arr[i] == max) {
                c = '?';
            }
        }

        System.out.println(c);
    }
}