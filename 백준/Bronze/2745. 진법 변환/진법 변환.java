import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int b = sc.nextInt();
        double sum = 0;
        int num = 0;
        int idx = n.length() - 1;

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                num = c - 'A' + 10;
            } else {
                num = c - '0';
            }
            sum += num * Math.pow(b, idx--);
        }

        System.out.println((int) sum);
    }
}