import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int N = scanner.nextInt();
        int[] intArray = new int[N];

        for (int i = 0; i < N; i++) {
            intArray[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();

        for (int j : intArray) {
            if (v == j) {
                count++;
            }
        }

        System.out.println(count);
    }
}
