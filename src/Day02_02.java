import java.util.Scanner;

// 피보나치 수열
public class Day02_02 {

    public void solutionNotArray(int n){
        int a=1, b=1, c;
        System.out.println(a + " " + b);
        for(int i=2; i<n; i++){
            c = a+b;
            System.out.println(c+" ");
            a = b;
            b = c;
        }
    }

    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] =1;
        for(int i=2; i<n; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Day02_02 T = new Day02_02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int x : T.solution(n)) System.out.println(x + " ");
    }
}
