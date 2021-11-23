/*
계산했던 내용을 저장해 중복 계산 방지 용도로 사용하는 방법이 보기 좋았음
하나의 Transaction 에서 선행 계산되었던 결과가 반복적 이루어 진다면 저장해서 사용하면 퍼포먼스 향상에 도움될 듯
 */

import java.util.ArrayList;
import java.util.List;

public class Memoize {

    private static List<Integer> memorizeCache = new ArrayList<>();

    public static int calculate(Integer input){

        if(input == 0){
            return 1;
        } else {

            if(memorizeCache.size() >= input){
                System.out.println("Retrieved from cache: " + input);
                return memorizeCache.get(input - 1);
            }

            System.out.println("Calculate for input: " + input);
            int factorial = input * calculate(input -1);
            /* 계산값을 저장해 계산 과정/단계를 줄여줌 */
            memorizeCache.add(factorial);
            return factorial;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 3: ");
        System.out.println(calculate(3));

        System.out.println("Cache Size: " + memorizeCache.size());
        System.out.println("Cache: " + memorizeCache);
        System.out.println("******");
        System.out.println("******");
        System.out.println("Factorial of 7: ");
        System.out.println(calculate(7));
        System.out.println("Cache Size: " + memorizeCache.size());
        System.out.println("Cache: " + memorizeCache);
    }

}


