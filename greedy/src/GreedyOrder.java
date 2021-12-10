import java.util.Arrays;
import java.util.Scanner;

public class GreedyOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] tmp = new int[n];

        for(int i = 0; i < n; i ++){
            tmp[i] = scan.nextInt();
        }

        Arrays.sort(tmp);

        int prev = 0;
        int result = 0;

        for(int i = 0; i < n; i ++){
            result += prev + tmp[i];
            prev += tmp[i];

        }

        System.out.println(result);
    }
}
