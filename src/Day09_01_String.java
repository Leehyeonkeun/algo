
import java.util.Scanner;

// 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 최소 거리를 순서대로 출력한다.
// 첨고 1) 좌/우 e와 떨어진 거리를 담고 두 배열의 최소값을 비교 후 담아준
// input  : teachermode e
// output : 1 0 1 2 1 0 1 2 2 1 0

public class Day09_01_String {

    public int[] solution(String s, char c){
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='e'){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='e') p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Day09_01_String T = new Day09_01_String();
        Scanner kb = new Scanner(System.in);
        // 문자열 읽기
        String str = kb.next();
        // 문자 읽기
        char c = kb.next().charAt(0);

        for(int x : T.solution(str,c)){
            System.out.print(x + " ");
        }

    }

}
