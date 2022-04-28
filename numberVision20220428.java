import java.util.*;
public class numberVision20220428 {
    public class Solution {
        public int solution(int n) {
            int answer = 0;
            String a = Integer.toString(n);

            for(int i =0; i < a.length(); i++){
                answer = answer + Integer.parseInt(a.substring(i,i+1));
            }
            System.out.println(answer);
            return answer;
        }
    }
}
