// 괄호안 문자 모두 제거

// input  : (A(BC)D)EF(G(H)(IJ)K)LM(N)
// output : EFLM

import java.util.Scanner;
import java.util.Stack;

public class Day06_01 {

    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x==')'){
                while (stack.pop()!='(');
            }
            else{
                stack.push(x);
            }
        }

        for(int i=0; i<stack.size(); i++) answer+=stack.get(i);

        return answer;
    }

    public static void main(String[] args) {
        Day06_01 T = new Day06_01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

}
