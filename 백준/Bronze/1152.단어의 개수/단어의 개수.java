import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        System.out.print(stringTokenizer.countTokens());
    }
}
/**
 Scanner in = new Scanner(System.in);

 String S = in.nextLine();
 in.close();

 StringTokenizer st = new StringTokenizer(S," ");

 System.out.println(st.countTokens());

 trim()
 '\u0020'(space) 이하의 공백들만 제거.

 strip()
 유니코드의 공백들을 모두 제거.
 */