import java.util.List;
import java.util.Scanner;

public class Cycling {
    static int [] ints;

    public static int  program_input(){

        int max=0;
        for (int i = 0; i <ints.length ; i++) {
            int j=i;
            int temp=0;
            while(j<ints.length){
                temp=temp+ints[j];
                if(temp>max){
                    max=temp;
                }
                j++;

            }

        }
        return max;
    }
/*
    public static  int program_input2(){
        int count=0;
        int sum=0;


        while(count<ints.length){
            sum+=ints[count];
        }

    }*/

    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int signs=scanner.nextInt();
        ints=new int[signs];

        for (int i = 0; i <signs ; i++) {
            ints[i]= scanner.nextInt();

        }

        System.out.println(program_input());
    }
}
