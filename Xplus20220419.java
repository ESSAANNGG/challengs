public class Xplus20220419 {
    class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            long c = x;

            for(int i=0; i < answer.length; i++){
                answer[i] = c;
                c += x;
            }
            return answer;
        }
    }
}
