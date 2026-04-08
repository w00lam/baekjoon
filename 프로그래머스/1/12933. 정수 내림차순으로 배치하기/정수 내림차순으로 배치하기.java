import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
            
        return Long.parseLong(new StringBuilder(new String(arr)).reverse().toString());
    }
}