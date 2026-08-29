import java.util.Scanner;
public class PetyaAndString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 = sc.next();
        String str2= sc.next();
        str1 = str1.toLowerCase();
        str2= str2.toLowerCase();
        if(str1.equals(str2)){
            System.out.println(0);
        }else{
            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i) > str2.charAt(i)){
                    System.out.println(1);
                    break;
                }else if(str1.charAt(i) < str2.charAt(i)){
                    System.out.println(-1);
                    break;
                }
            }
        }
        sc.close();
    }
    
}
