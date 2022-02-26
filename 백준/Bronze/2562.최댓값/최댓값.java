import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int list[] = new int[9];
        int index = 0;
        int max = 0;
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        for (int key : list) {
            count++;
            if (key > max) {
                max = key;
                index = count;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}