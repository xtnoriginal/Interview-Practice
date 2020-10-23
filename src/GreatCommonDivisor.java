public class GreatCommonDivisor {
    public static int  gcd(int x,int y){
        if (y==0) return x;
        return gcd(y, x % y);

    }
    public  static int gcd2(int x,int y){
        while(true){
            int temp=x%y;
            x=y;
            y=temp;

            if(temp==0){
                break;
            }
        }
        return x;
    }


    public  static int brute_gcd(int m, int n) {
        int t = Math.min(m,n);
        while(m % t > 0 || n % t > 0) {
            t--;
        }
        return t;
    }

    public  static  void  main(String arg[]){

        System.out.println(gcd(60,24));
        System.out.println(gcd2(60,24));
        System.out.println(brute_gcd(60,24));


    }
}
