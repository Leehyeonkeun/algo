
import java.util.Scanner;

// 문자형 > 숫자형 > 아스키모드 대문자 변환
// 첨고 1) replace 연달 사용 가능, int를 char로 타입변경하면 아스키코드 변환
//        A - 65 ~ Z - 90
// input  : 4
//          #****###**#####**#####**##**
// output : K2HS7E

public class Day10_01_String {

    public String solution(int n, String s){
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = s.substring(0,7).replace("#","1").replace("*","0");
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            s=s.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Day10_01_String T = new Day10_01_String();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.print(T.solution(n,str));
    }

}
