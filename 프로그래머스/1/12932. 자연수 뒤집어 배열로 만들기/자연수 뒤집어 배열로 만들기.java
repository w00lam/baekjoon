import java.util.Arrays;

class Solution {
    public int[] solution(long n) {        
        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        int[] answer = Arrays.stream(reversed.split("")).mapToInt(Integer::parseInt).toArray();
        
        return answer;
    }
}