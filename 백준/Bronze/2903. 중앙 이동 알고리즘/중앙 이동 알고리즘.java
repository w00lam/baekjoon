import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println((int) Math.pow(Math.pow(2, n) + 1, 2));
    }
}