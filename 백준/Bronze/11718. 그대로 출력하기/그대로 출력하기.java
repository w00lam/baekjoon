import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            stringBuilder.append(string).append("\n");

            if(string.isBlank()){
                break;
            }
        }

        System.out.println(stringBuilder);
    }
}