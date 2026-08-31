import java.util.Scanner;
import java.util.Arrays;
public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //basically you have to check 
        //if you the grabled string contains all the letters froms string 1 and 2
        String guest = sc.next();
        String host  = sc.next();
        String pile = sc.next();
        String str = new StringBuilder(guest).append(host).toString();
        //edge case 
        if(str.length()!= pile.length()){
            System.out.println("NO");
            sc.close();
            return;
        }
        char[] arr1= str.toCharArray();
        Arrays.sort(arr1);
        char[] arr2= pile.toCharArray();
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
    
}

