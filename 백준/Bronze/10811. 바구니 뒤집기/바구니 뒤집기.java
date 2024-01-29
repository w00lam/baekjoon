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

        int m = scanner.nextInt();
        int temp;
        for (int i = 0; i < m; i++) {
            int I = scanner.nextInt() - 1;
            int J = scanner.nextInt() - 1;

            while (I < J) {
                temp = intArray[I];
                intArray[I++] = intArray[J];
                intArray[J--] = temp;
            }
        }

        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
