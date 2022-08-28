
import java.util.Scanner;

// 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기, 반복횟수가 1인 경우 샹
// 첨고 1) 좌/우 e와 떨어진 거리를 담고 두 배열의 최소값을 비교 후 담아준
// 참고 2) i 와 i+1 값을 비교하는 것으로 가장 끝의 i와 비교할 때 "out of index.." 에러를 파히기 위해 " " 붙이고 s.length-1까지 비교
// input  : KKHSSSSSSSE
// output : K2HS7E

public class Day09_02_String {

    public String solution(String s){
       String answer = "";
       s=s + " ";
       int cnt =1;
       for(int i=0; i<s.length()-1; i++){
           if(s.charAt(i)==s.charAt(i+1)) cnt++;
           else{
               answer+=s.charAt(i);
               if(cnt>1) answer+=String.valueOf(cnt);
               cnt=1;
           }
       }
        return answer;
    }

    public static void main(String[] args) {
        Day09_02_String T = new Day09_02_String();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }

}
