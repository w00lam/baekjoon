import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        System.out.println((n - 2) * (n - 1) * n / 6);
        System.out.println(3);
    }
}