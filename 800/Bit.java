import java.util.Scanner;
public class Bit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        for(int i=0; i<n; i++){
            String str= sc.next();
            if(str.contains("++")){
                ans++;
            }else if(str.contains("--")){
                ans--;
            }
        }
        System.out.println(ans);
        sc.close();
    }
    
}
