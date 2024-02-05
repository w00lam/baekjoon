import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);

        if (arr[0] + arr[1] > arr[2]) {
            System.out.println(arr[0] + arr[1] + arr[2]);
        } else {
            System.out.println((arr[0] + arr[1]) * 2 - 1);
        }
    }
}