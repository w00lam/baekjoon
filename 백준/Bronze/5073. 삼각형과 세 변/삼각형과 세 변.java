import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[3];

        while (true) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }

            Arrays.sort(arr);
            if (arr[2] >= arr[0] + arr[1]) {
                sb.append("Invalid\n");
            } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
                sb.append("Equilateral\n");
            } else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
                sb.append("Isosceles\n");
            } else {
                sb.append("Scalene\n");
            }
        }

        System.out.print(sb);
    }
}