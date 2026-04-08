class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        long answer = sqrt * sqrt == n ? (sqrt + 1) * (sqrt + 1) : -1;
        return answer;
    }
}