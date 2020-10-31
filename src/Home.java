import java.util.Scanner;

public class Home {


    public static int feeBackHome(int amount,int[] fees){
        int max=Integer.MIN_VALUE;


        for (int i = 0; i <fees.length ; i++) {
            int temp=amount-fees[i];
            if(max<temp){
                max=temp;
            }
        }


        return  max;

    }



    public  static  void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int numberOfScholaships=scanner.nextInt();

        int result=Integer.MIN_VALUE;

        for (int i = 0; i <numberOfScholaships ; i++) {
            int scholarshipValue= scanner.nextInt();
            int numberOfUnis=scanner.nextInt();

            int [] tuition=new int[numberOfUnis];

            for (int j = 0; j <numberOfUnis; j++) {
                tuition[j]= scanner.nextInt();
            }
            int temp=feeBackHome(scholarshipValue,tuition);
            if(result<temp){
                result=temp;
            }

        }

        System.out.println(result);


    }
}
