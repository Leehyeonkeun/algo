import java.util.*;

// 배열을 활용한 덧셈.,.
// input  : 10
//          1 0 1 1 1 0 0 1 1 0
// output : 10

public class Day12_01_Array {

    // 1 가위 2 바위 3 보

    public int solution(int n, int[] arr){
        int answer=0, cnt = 0 ;

        for(int i=0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer+=cnt;
            }
            else cnt =0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Day12_01_Array T = new Day12_01_Array();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n,arr));

    }

}
