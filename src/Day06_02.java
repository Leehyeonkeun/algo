import java.util.Scanner;

// 재귀함수는 stack 을 구성해 저장 후 순차적 실행한다.
// input  : 4
// output : 1 2 3 4

public class Day06_02 {

    public void DFS(int n){
        if(n==0) return;
       else {
            // 재귀함수는 Stack을 사용한다
            //System.out.print(n+" " );
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Day06_02 T = new Day06_02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.DFS(n);
    }

}
