import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int m = n;

        while(true){

            n = (n % 10 * 10) + (n / 10 + n % 10) % 10;
            i++;
            if (m == n) {
                break;
            }

        }
        scanner.close();

        System.out.println(i);
    }
}