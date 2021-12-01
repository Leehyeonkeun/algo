import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GreedyChange2 {

    public static void main(String[] args) throws IOException {
        int charge;
        int coin[] = {500,100,50,10,5,1};
        int result = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        charge = 1000 - Integer.parseInt(br.readLine());

        for(int i = 0; i < coin.length; i++){

            if(coin[i] <= charge){
                result += charge / coin[i];
                charge -= (charge / coin[i]) * coin[i];
            }
        }

        System.out.println(result);
    }
}
