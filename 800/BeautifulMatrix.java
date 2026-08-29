import java.util.Scanner;
import java.lang.Math;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //build matrix 
        int row =5;
        int col=5;
        int r=-1;
        int c=-1;
        int[][] matrix=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j]= sc.nextInt();
                if(matrix[i][j] ==1){
                    r=i;
                    c=j;
                }
            }
        }
        int moves=0;
        moves+=Math.abs(2-r) + Math.abs(2-c);
        System.out.println(moves);
        sc.close();
    }
    
}
