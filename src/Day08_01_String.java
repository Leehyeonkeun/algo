import java.util.Scanner;

/*
 회문문자열
 */

public class Day08_01_String {

    public String solution(String str){
        String answer = "YES";
        str=str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Day08_01_String T = new Day08_01_String();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }

}
