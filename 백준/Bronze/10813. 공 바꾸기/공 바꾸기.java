import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = i + 1;
        }

        int temp;
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();

            temp = intArray[I - 1];
            intArray[I - 1] = intArray[J - 1];
            intArray[J - 1] = temp;
        }

        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
