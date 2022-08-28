// 대소문자 변환

import java.util.Scanner;

public class Day07_01_String {

    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x))  answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);

            // 아스키 코드 풀이
            /*
            if(x>=97 && x<122) answer+=(char)(x-32);
            else answer+=(char)(x-32);
             */
        }
        return answer;
    }

    public static void main(String[] args) {
        Day07_01_String T = new Day07_01_String();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
