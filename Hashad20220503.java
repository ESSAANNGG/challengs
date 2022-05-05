public class Hashad20220503 {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            String number =  Integer.toString(x);

            for(int i = 0; i < number.length(); i++){
                String a1 = number.substring(i, i+1);
                int a = Integer.parseInt(a1 + a1);
                System.out.println(a+"aa=========");

            }

            return answer;
        }
    }
}
