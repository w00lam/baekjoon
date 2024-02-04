import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = s.nextInt();

            if (n == -1) {
                break;
            }

            int sum = 0;
            int index = 0;
            int[] divisor = new int[n];
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    divisor[index++] = i;
                }
            }

            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i = 0; i < index; i++) {
                    if (i == index - 1) {
                        sb.append(divisor[i]).append("\n");
                    } else {
                        sb.append(divisor[i]).append(" + ");
                    }
                }
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
        }

        System.out.println(sb);
    }
}