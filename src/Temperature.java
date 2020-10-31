import java.util.Scanner;

public class Temperature {



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        int result=Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {

            int temp=scanner.nextInt();
            if(result<temp){
                result=temp;
            }

        }

        System.out.println(result);

    }
}
