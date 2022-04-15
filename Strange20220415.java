import java.util.Locale;

public class Strange20220415 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            int a = s.indexOf(" ");
            if (a >= 0) {
                answer = s.toUpperCase();
            }
            return answer;
        }
    }
}