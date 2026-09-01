import java.util.Arrays;
import java.util.Scanner;
public class GravityFlip {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //just sort
        int n = sc.nextInt();
        int[] blocks = new int[n];
        for(int i=0; i<n; i++){
            blocks[i] = sc.nextInt();
        }
        Arrays.sort(blocks);
        for(int block: blocks){
            System.out.print(block + " ");
        }
        sc.close();
    }
    
}

