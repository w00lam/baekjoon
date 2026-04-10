class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int last4 = phone_number.length() - 4;
            
        for(int i = 0; i < last4; i++){
            sb.append("*");
        }
        
        sb.append(phone_number.substring(last4));
        
        
        return sb.toString();
    }
}