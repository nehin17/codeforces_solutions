import java.util.Scanner;
public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n ; i++){
            long num= sc.nextLong();
            System.out.println(hasOddDivisor(num));
        }
        sc.close();
    }
    private static String hasOddDivisor(long num){
        //brute force 
        /*
        for(long i =3; i<=num; i+=2){
            if(num%i == 0){
                return "YES";
            }
        }
        return "NO";
        */
        //optimised -> if a number is not a power of 2 then it will have odd divisor 
        while(num%2 == 0){
            num = num/2;
        }
        if(num<=1){
            return "NO";
        }
        return "YES";
    }
}
