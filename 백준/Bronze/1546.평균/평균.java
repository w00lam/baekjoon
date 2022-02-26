import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double arr[] = new double[Integer.parseInt(bufferedReader.readLine())]; // 테스트 케이스 개수 지정.

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        for (int i = 0; i < arr.length; i++) { // 테스트 케이스 생성.
            arr[i] = Double.parseDouble(stringTokenizer.nextToken());
        }

        double sum = 0; // 수정한 총 시험점수의 합.
        Arrays.sort(arr); // 각 테스트 케이스의 최대값을 구하기위해 정렬.

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / arr[arr.length - 1] * 100;
        }

        System.out.print(sum / arr.length);
    }
}
