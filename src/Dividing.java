import java.util.ArrayList;
import java.util.Scanner;

public class Dividing {

    public  static  int plank(ArrayList<Integer> arrayList,int np){
        int check=arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if(check>arrayList.get(i)){
                check=arrayList.get(i);
            }

        }
        int pos=1;
        while(true){

            int total=0;


            for (int i = 0; i <arrayList.size() ; i++) {
                total=total+(arrayList.get(i)/pos);
            }


            if(total<np){

                return pos-1;
            }
            if(check==pos){
                break;
            }

            pos++;

        }
        return  0;
    }

    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);

        int count=scanner.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>();

        for (int i = 0; i <count ; i++) {
            arrayList.add(scanner.nextInt());
        }

        int numberOfPlanks=scanner.nextInt();

        System.out.println(plank(arrayList,numberOfPlanks));


    }
}
