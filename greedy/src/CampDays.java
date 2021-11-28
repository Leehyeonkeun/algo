// 백준 4796번 문제 풀이
// 오ㅐ 그리드 알고리즘으로 분류될까 ??
// Greedy Algorithm의 대표가 코인의 최적 해를 구하는 건데 이게 딱 그거네 ;;
// 하지만, 그리드 방법으로 문제 풀이를 접근한건지는 아직 모르겠음...
// 단순 나누기 나머지를 했기 때문에..

import java.io.*;
import java.util.StringTokenizer;

public class CampDays {

    static int l;
    static int p;
    static int v;
    static int result;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cnt = 1;

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            if(l == 0 && p == 0 && v == 0)
                break;

            result = (v / p) * l + Math.min(l, (v % p));
            System.out.println("Case " + cnt++ + " : "+ result);
        }
    }
}
