
import java.util.Scanner;

// 팰림드룸 - 앞에서 읽을 대나 뒤에서 읽을 때나 같은 문자열을 팰린드룸이라고 한다.
// 첨고 1) 아스키 코드, 숫자 0은 '48', 숫자 9는 '57'
// input  :
// output : 1 2 3 4

public class Day08_03_String {

    public int solution(String s){
        String answer = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Day08_03_String T = new Day08_03_String();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }

}
