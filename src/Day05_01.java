import java.util.HashMap;
import java.util.Scanner;

// 입력값 중 가장 많이 나온 캐릭터 수 (hashMap 의 key, getOrDefault 사용)

// input
// 5
// aaabc
// output
// a
public class Day05_01 {

    public char solution(int n, String s){
        char answer=' ';

        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            System.out.println(key+" "+map.get(key));
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Day05_01 T = new Day05_01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println("anser : "+ T.solution(n, str));
    }
}
