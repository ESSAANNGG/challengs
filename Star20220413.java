import java.util.Scanner;

public class Star20220413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하시오.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
