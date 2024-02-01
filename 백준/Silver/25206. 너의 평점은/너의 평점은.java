import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double major_sum = 0;
        double credit_sum = 0;
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] scoreList = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for (int j = 0; j < gradeList.length; j++) {
                if (grade.equals(gradeList[j]) && !grade.equals("P")) {
                    major_sum += credit * scoreList[j];
                    credit_sum += credit;
                }
            }
        }

        double average = major_sum / credit_sum;
        System.out.printf("%.6f\n", average);
    }
}