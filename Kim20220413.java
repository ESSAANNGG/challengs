public class Kim20220413 {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i < seoul.length; i ++){
            if (seoul[i].equals("Kim")){
                System.out.println("김서방은 " + i + "번째에 있다");
            }
        }
        return answer;
    }
}