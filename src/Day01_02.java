import java.util.*;

// 해당 문자 수 찾기
// input cabcab c
// output 2
public class Day01_02 {

    public String solution_old(String str){
        String answer = "";
        int m=Integer.MIN_VALUE;
        String[] s=str.split(" ");

        for(String x : s){
            int len = x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }

    public String solution(String str){
        String answer = "";
        int m=Integer.MIN_VALUE, pos;

        while ((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > m) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Day01_02 T = new Day01_02();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));

    }

}
