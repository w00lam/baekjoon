import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] x_axis = new int[3];
        int[] y_axis = new int[3];
        int x;
        int y;

        for (int i = 0; i < 3; i++) {
            x_axis[i] = s.nextInt();
            y_axis[i] = s.nextInt();
        }

        if (x_axis[0] == x_axis[1]) {
            x = x_axis[2];
        } else {
            x = x_axis[0] == x_axis[2] ? x_axis[1] : x_axis[0];
        }
        if (y_axis[0] == y_axis[1]) {
            y = y_axis[2];
        } else {
            y = y_axis[0] == y_axis[2] ? y_axis[1] : y_axis[0];
        }

        System.out.println(x + " " + y);
    }
}