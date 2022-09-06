import java.util.Scanner;

// 가위 바위 보 문
// 첨고 1) 경우의 수 확실한 것 부터 선언, 이후 나머지 선언
// 팜고 2) 제너릭을 char 로 받음, toCharArray() 실행
// input  :
// output :

public class Day11_01_Array {

    // 1 가위 2 바위 3 보

    public String solution(int n, int[] a, int[] b){
        String answer="";
        for(int i=0; i<n; i++){
            else if(a[i]==1 && b[i]==3) answer+="A";
            else if(a[i]==2 && b[i]==1) answer+="A";
            else if(a[i]==3 && b[i]==2) answer+="a";
            else (a[i]==b[i]) answer+="B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Day11_01_Array T = new Day11_01_Array();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = kb.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = kb.nextInt();
        }

        for(char x : T.solution(n,a,b).toCharArray())
            System.out.println(x);

    }

}
