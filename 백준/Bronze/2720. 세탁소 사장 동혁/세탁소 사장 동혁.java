import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int[] cash = {25, 10, 5, 1};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int change = s.nextInt();
            for (int j = 0; j < 4; j++) {
                sb.append(change / cash[j]).append(" ");
                change %= cash[j];
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}