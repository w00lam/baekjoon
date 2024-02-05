import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] x_axis = new int[n];
        int[] y_axis = new int[n];

        for (int i = 0; i < n; i++) {
            x_axis[i] = s.nextInt();
            y_axis[i] = s.nextInt();
        }

        Arrays.sort(x_axis);
        Arrays.sort(y_axis);

        System.out.println((x_axis[n - 1] - x_axis[0]) * (y_axis[n - 1] - y_axis[0]));
    }
}