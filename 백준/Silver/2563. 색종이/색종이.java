import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] square = new boolean[100][100];
        int n = sc.nextInt();
        int area = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!square[j][k]) {
                        square[j][k] = true;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);
    }
}