public class Num20220413 {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 1 || num % 2 == -1){
            answer = "Odd";
        } else {
            answer = "Even";
        }
        return answer;
    }
}
