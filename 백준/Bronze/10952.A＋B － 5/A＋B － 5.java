import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();

        while(true) {

            stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());

            if(A==0 && B==0) {
                break;
            }
            stringBuilder.append((A+B)).append('\n');
        }
        System.out.println(stringBuilder);
    }
}