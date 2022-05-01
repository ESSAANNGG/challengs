public class Numberbooleancheck20220501 {
    class Solution {
        public boolean solution(String s) {
            final String NUM = "^[0-9]+$";

            boolean answer = true;
            if(s.matches(NUM)){
                answer = true;
            }else{
                answer = false;
            }if (s.length() != 4 && s.length() != 6){
                answer = false;
            }
            return answer;
        }
    }
}
