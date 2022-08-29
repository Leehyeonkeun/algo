import java.util.Scanner;

// 배열 카운팅 , 중복 제거
// 첨고 1) 기준 값을 주고 최대값이 나타나면 변경해줌
// input  : 8
//          130 135 148 140 145 150 150 153
// output : 5

public class Day10_02_Array {

    public int solution(int n, int[] arr){
        int answer = 1, max=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                answer++;
                max=arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Day10_02_Array T = new Day10_02_Array();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }

}
