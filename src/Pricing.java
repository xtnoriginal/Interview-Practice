import java.util.ArrayList;
import java.util.Scanner;

public class Pricing {



    public  static long   price_calc(Long start,Long end,long k){
        System.out.println(start+" "+end);
        if(start-end<3){

            for (int i = Math.toIntExact(start); i < end; i++) {
                Long l=price((long) i);
                if(l>k){
                    return i-1;
                }

            }
        }
        Long mid=(start+end)/2;

        if(price(mid)>k){
            return price_calc(start,mid,k);

        }

        return price_calc(mid,end,k);


    }

    public static Long price(Long k){


        return  pricern(1,k-1,k);
        /*Long total=0L;
        for (int i = 1; i <k ; i++) {
            total+=i*(k/i);
        }

        return total;*/

    }

    public  static  Long pricern(long start,long end,long k){
        if(start==end){
            return start*(k/start);
        }


        return start*(k/start)+pricern(start+1,(start+end)/2,k)+pricern(1+(start+end)/2,end,k);

    }



    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        Long k=scanner.nextLong();


        for (int i = 1; i < 64; i++) {

            Double ans=Math.pow(2,i);

            if(price(ans.longValue())>k){
                Double ans2=Math.pow(2,i-1);
                System.out.println(price_calc(ans2.longValue(),ans.longValue(),k));

                break;

            }

        }





    }
}
