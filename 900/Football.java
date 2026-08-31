import java.util.Scanner;
public class Football{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String pos= sc.next();
        char[] arr = pos.toCharArray();
        //the key is to initialze count as 1 
        int count = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
                if(count >= 7){
                    System.out.println("YES");
                    sc.close();
                    return;
                }
            } else {
                count = 1;
            }
        }

        System.out.println("NO");
        sc.close();
    }
    
}
