import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        while (true) {
            int a = s.nextInt();
            int b = s.nextInt();

            if (a == 0 && b == 0) {
                break;
            } else {
                if (b % a == 0) {
                    sb.append("factor").append("\n");
                } else if (a % b == 0) {
                    sb.append("multiple").append("\n");
                } else {
                    sb.append("neither").append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}