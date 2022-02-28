import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        int a = System.in.read(); // byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값 저장.
        System.out.println(a);
    }
}
