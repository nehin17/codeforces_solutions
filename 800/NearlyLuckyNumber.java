import java.util.Scanner;
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //uselong 
        long n = sc.nextLong();
        int count=0;
        while(n>0){
            //preecedence issue 
            int digit = (int) (n%10);
            if(digit == 4 || digit == 7){
                count++;
            }
            n = (long) n/10;
        }
        if(lucky(count)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
    private static boolean lucky(int n){
        if(n == 0){
            return false;
        }
        while(n>0){
            int digit = n%10;
            if(digit != 4 && digit !=7){
                return false;
            }
            n = n/10;
        }
        return true;
    }
    
}
