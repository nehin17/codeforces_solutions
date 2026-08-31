import java.util.Scanner;
public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n= sc.nextLong();
        long k= sc.nextLong();
        //bruute force 
        if(n%2 ==0){
            //even 
            if(k <= (long) (n/2)){
                System.out.println(2*k -1);
                sc.close();
                return;
            //return kth odd number 

            }else{
                //adjust k 
                k-=(long) (n/2);
                System.out.println(2*k);
                sc.close();
                return;
                //return kth even number 
            }
        }else{
            if(k > (long)((n/2)+1)){
                //adjust k 
                k-=(long) ((n/2)+1);
                System.out.println(2*k);
                sc.close();
                return;
                //return kth even number 
            }else{
                System.out.println(2*k -1);
                sc.close();
                return;
            //return kth odd numbe
            }
        }
    }
    
}
/*
OPTIMISED LOOP 
if (k <= (n + 1) / 2) {
    System.out.println(2 * k - 1);
} else {
    k -= (n + 1) / 2;
    System.out.println(2 * k);
}
 */