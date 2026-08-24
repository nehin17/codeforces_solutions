import java.util.Scanner; 

public class Watermelon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = possible(n);
        System.out.println(ans);
        sc.close();
    }
    public static String possible(int n){
        //edge case 
        if(n ==2){
            return "NO";
        }
        if(n%2==0){
            return "YES";
        }
        return "NO";
    }
}