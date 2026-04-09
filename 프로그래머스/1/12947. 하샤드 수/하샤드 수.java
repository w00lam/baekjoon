class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int number = x;
        
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }
        
        boolean answer = x % sum == 0 ? true : false;
        return answer;
    }
}