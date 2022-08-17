import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int tp = Integer.parseInt(bufferedReader.readLine());
        final int tc = Integer.parseInt(bufferedReader.readLine());
        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < tc; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            int price = Integer.parseInt(input[0]);
            int count = Integer.parseInt(input[1]);
            productList.add(new Product(price, count));
        }

        System.out.print(isMatch(tp, productList) ? "Yes" : "No");
    }

    private static boolean isMatch(int tp, List<Product> productList) {
        return tp == productList.stream().mapToInt(p -> p.price * p.count).sum();
    }

    private static class Product {
        private final int price;
        private final int count;

        public Product(int price, int count) {
            this.price = price;
            this.count = count;
        }
    }
}