import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> arrayList =new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        Collections.sort(arrayList);

        for (int num : arrayList) {
            stringBuilder.append(num).append('\n');
        }

        System.out.println(stringBuilder);
    }
}