import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] intArray = new int[n];
        
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();
            int K = scanner.nextInt();

            for (int j = I - 1; j < J; j++) {
                intArray[j] = K;
            }
        }

        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
