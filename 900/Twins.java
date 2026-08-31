import java.util.Scanner;
import java.util.Arrays;
public class Twins{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //n coins of diff value 
        //you get more amount 
        //min number of coins whose sum is greater than the remaning coins 
        int n = sc.nextInt();
        int[] nums= new int[n];
        int total=0;
        for(int i =0; i<n; i++){
            nums[i]= sc.nextInt();
            total+=nums[i];
        }
        Arrays.sort(nums);
        //maintain a window 
        int sum =0;
        int count=0;
        for(int i =n-1; i>=0; i--){
            sum+=nums[i];
            count++;
            total-=nums[i];
            if(sum> total){
                System.out.println(count);
                sc.close();
                return;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
