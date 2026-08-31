import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        //ceil(a / b) = (a + b - 1) / b
        Scanner sc= new Scanner(System.in);
        int dist = sc.nextInt();
        //we want celing division 
        System.out.println((dist+4)/5);
        sc.close();
    }
    
}
