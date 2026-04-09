class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
        if(num == 1){
            return 0;
        }
        
        while(n != 1){
            if(answer == 500){
                return -1;
            }
            
            if(n % 2 == 0){
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            
            answer++;
        }
        return answer;
    }
}