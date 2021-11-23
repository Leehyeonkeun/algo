/*
계산했던 내용을 저장해 중복 계산 방지 용도로 사용하는 방법이 보기 좋았음
하나의 Transaction 에서 선행 계산되었던 결과가 반복적 이루어 진다면 저장해서 사용하면 퍼포먼스 향상에 도움될 듯
 */

public class Memoize {

    public static int calculate(Integer input){

        if(input == 0){
            return 1;
        } else {
            System.out.println("Calculate for input: " + input);
            return input * calculate(input -1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 3: ");
        System.out.println(calculate(3));

        System.out.println("******");
        System.out.println("******");
        System.out.println("Factorial of 4: ");
        System.out.println(calculate(4));
    }

}


