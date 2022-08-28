
import java.util.Scanner;

// 팰림드룸 - 앞에서 읽을 대나 뒤에서 읽을 때나 같은 문자열을 팰린드룸이라고 한다.
// StringBuiler.reverse 의 편리함과 특수문자 제거
// input  : found7,time,emit,7Dnuof
// output : 1 2 3 4

public class Day08_02_String {

    public String solution(String s){
        String answer = "NO";
        s=s.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(s).reverse().toString();
        System.out.println(s);
        System.out.println(tmp);
        if(s.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Day08_02_String T = new Day08_02_String();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));

    }

}
