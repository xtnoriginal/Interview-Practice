import java.math.BigInteger;
import java.util.ArrayList;

public class Fibonnaci {
    static int array[];

    public static BigInteger fibo_bigint(int n) {
        if (n==0){
            return BigInteger.ZERO;
        }
        if (n==1) {
            return BigInteger.ONE;
        }
        BigInteger [] table = new BigInteger[3];
        table[0] = new BigInteger("0");
        table[1] = new BigInteger("1");
        for (int i=2; i<n; i++) {
            table[2] = table[1].add(table[0]);
            table[0] = table[1];
            table[1] = table[2];

        }
        return table[2];
    }

    public static long fibo_(int n) {
        return Math.round(
                (1.0/Math.sqrt(5.0))*
                        Math.pow(1.6180339887,n));
    }

    public static int Fib_(int n){
        int a=0;
        int b=1;

        for (int i = 0; i <n ; i++) {
            int temp=a+b;
            a=b;
            b=temp;
        }

        return b;
    }


    public static int   Fib_Dynamic(int n){

        array=new int[n+1];
        array[0]=0;
        array[1]=1;

        for (int i = 2; i <n+1 ; i++) {

            array[i]=array[i-1]+array[i-2];

        }

        return array[n];

    }

    public  static int  Fib_factorial(int number){
        if(number==0){
            return 0;

        }else if(number==1){
            return 1;
        }else{

            return  Fib_factorial(number-1)+Fib_factorial(number-2);

        }

    }

    public static  void main(String args[]){
        System.out.println(Fib_factorial(5));
        System.out.println(Fib_Dynamic(5));
        System.out.println(fibo_bigint(5));
        System.out.println(fibo_(5));

    }
}
