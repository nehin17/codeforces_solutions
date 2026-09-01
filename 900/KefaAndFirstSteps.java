import java.util.Scanner;
public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] amount = new int[n];
        for(int i =0; i<n; i++){
            amount[i] = sc.nextInt();
        }
        int len =1;
        int curr =1;
        for(int i =1; i<n; i++){
            if(amount[i-1]<= amount[i]){
                curr++;
            }else{
                curr =1;
            }
            len = Math.max(len, curr);
        }
        System.out.println(len);
        sc.close();
    }
    
}

