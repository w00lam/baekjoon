import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < cnt + 1; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}