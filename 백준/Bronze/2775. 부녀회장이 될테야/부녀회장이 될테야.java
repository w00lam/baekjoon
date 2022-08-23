import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final int row = 15;
    public static final int col = 15;
    public static final int[][] APT = new int[row][col];

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        build_APT();

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(bufferedReader.readLine());
            int n = Integer.parseInt(bufferedReader.readLine());

            stringBuilder.append(APT[k][n]).append("\n");
        }

        System.out.print(stringBuilder);
    }

    public static void build_APT() {
        for (int i = 0; i < col; i++) {
            APT[i][1] = 1;
            APT[0][i] = i;
        }

        for (int i = 1; i < col; i++) {
            for (int j = 2; j < row; j++) {
                APT[i][j] = APT[i - 1][j] + APT[i][j - 1];
            }
        }
    }
}
