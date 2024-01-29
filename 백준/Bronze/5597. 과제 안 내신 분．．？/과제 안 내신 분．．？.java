import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[30];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 28; i++) {
            int n = scanner.nextInt();
            intArray[n - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (intArray[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
