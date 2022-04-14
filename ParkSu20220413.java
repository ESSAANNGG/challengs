public class ParkSu20220413 {
    public String solution(int n) {
        String answer = "";
        for(int a=0; a < n; a++){
            if (a % 2 == 0){
                answer += "수";
            } else if (a % 2 == 1){
                answer += "박";
            }
        }
        return answer;
    }
}
