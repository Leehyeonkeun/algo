import java.util.Scanner;

// 배열을 활용한 서로 크기 비교 결과 값 도출
// 특즹 ) 비교 결과를 배열에 저장
// input  : 5
//          87 89 92 100 76
// output : 10

public class Day12_02_Array {

    // 1 가위 2 바위 3 보

    public int[] solution(int n, int[] arr){
        int [] answer = new int[n];

        for(int i=0; i<n; i++){
            int cnt =1;
           for(int j=0; j<n; j++){
               if(arr[i] < arr[j]) cnt ++;
           }
           answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Day12_02_Array T = new Day12_02_Array();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        for(int x : T.solution(n, arr)) System.out.println(x + " ");

    }

}
