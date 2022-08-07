import java.util.*;
//https://www.inflearn.com/course/%EC%9E%90%EB%B0%94-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%ED%85%8C%EB%8C%80%EB%B9%84
// 해당 문자 수 찾기
// input cabcab c
// output 2
public class Day01_01 {

    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        System.out.println(str + " " + t);

        // 향상된 for 문
        for(char x : str.toCharArray()){
            if(x==t) answer ++;
        }

        /*for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==t) answer ++;
        }*/

        return answer;
    }

    public static void main(String[] args) {
        Day01_01 T = new Day01_01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));

    }

}
