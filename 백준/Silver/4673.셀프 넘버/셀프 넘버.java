public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if (n < 10001) {
                check[n] = true; // 셀프 넘버 -> true
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                stringBuilder.append(i).append('\n');
            }
        }

        System.out.println(stringBuilder);
    }

    public static int d(int n) { // 셀프넘버 확인 함수
        int m = n;

        while (n != 0) {
            m = m + (n % 10);
            n = n / 10;
        }

        return m;
    }
}
