import java.util.Scanner;
public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row= sc.nextInt();
        int col= sc.nextInt();
        System.out.println((int) (row * col)/2);
        sc.close();
    }
    
}
