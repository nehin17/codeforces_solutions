import java.util.Scanner;
public class StonesOnTheTable{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int stones=0;
        for(int i =1;i<n; i++){
            if(str.charAt(i-1) == str.charAt(i)){
                stones++;
            }
        }
        System.out.println(stones);
        sc.close();
    }
    
}
