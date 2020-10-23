import java.util.Arrays;
import java.util.Collection;

public class CoinChangeProblem {

    public static int change(int variations[],int amount ){
        int f[]=new int[amount];
        for (int i = 1; i <amount ; i++) {
            int temp=999999;
            int j=1;

            while (j<=i && i>=variations[i] ) {
                temp = Math.min(temp, f[i - variations[j]]);
                j++;
            }
            f[i]=temp+1;

        }

        return  f[amount];
    }


    public  static void main(String [] args){

        int [] a={1,2,3};
        System.out.println(change(a,6));

    }
}
