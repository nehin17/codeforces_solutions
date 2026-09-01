import java.util.Scanner;
public class HQ9 {
    public static void main(String[] args) {
        //basic if else + observation that + wont print anything 
        Scanner sc= new Scanner(System.in);
        String program = sc.next();
        if(!program.contains("H") && !program.contains("Q") && !program.contains("9")){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
        sc.close();
    }
    
}
//&& !program.contains("+")

