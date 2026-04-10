import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        List<String> list = Arrays.asList(seoul);
        int x = list.indexOf("Kim");
        String answer = "김서방은 " + x + "에 있다";
        return answer;
    }
}