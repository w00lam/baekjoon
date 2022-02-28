import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a = scanner.next();
        scanner.close();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a.charAt(i) - '0';
        }

        System.out.println(sum);
/**
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.

 int sum = 0;

 for(byte value : br.readLine().getBytes()) {
 sum += (value - '0');	// 또는 (a-48)
 }

 System.out.print(sum);
 */
    }
}
