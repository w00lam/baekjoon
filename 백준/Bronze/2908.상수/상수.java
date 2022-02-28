import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int a = Integer.parseInt(new StringBuilder(stringTokenizer.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(stringTokenizer.nextToken()).reverse().toString());

        System.out.println(a > b ? a : b);
    }
}