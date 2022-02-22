import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int list[] = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[i] = a + b;
        }

        for (int hap : list) {
            System.out.println(hap);
        }
    }
}