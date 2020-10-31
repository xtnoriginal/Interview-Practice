import java.util.Scanner;

public class Path {

    static boolean[][] grid;





    public  static  int pathetic(int x,int y ){
        int[][] pathGrid=new int[grid.length][grid.length];

        for (int i = 0; i < grid.length ; i++) {
            if(!grid[i][0]){

                pathGrid[0][i]=1;

            }else{
                break;
            }
        }


        for (int i = 0; i < grid.length ; i++) {
            if(grid[0][i]==false){

                pathGrid[0][i]=1;
            }else{
                break;
            }
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid.length; j++) {
                if(!grid[i][j]){


                    pathGrid[i][j]=pathGrid[i-1][j]+pathGrid[i][j-1];
                }

            }


        }
        return pathGrid[grid.length-1][grid.length-1];
    }


    public static void  main(String[] args){
       Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();
        int obstacle=scanner.nextInt();

        grid=new boolean[n][n];

        for (int i = 0; i <obstacle ; i++) {
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            grid[x-1][y-1]=true;
        }


        System.out.println(pathetic(0,0));


    }
}
