import java.util.Scanner;
import java.util.HashSet;
public class Pangram{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n<26){
            System.out.println("NO");
            sc.close();
            return;
        }
        String str= sc.next().toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(char ch: str.toCharArray()){
            set.add(ch);
        }
        if(set.size()==26){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
    
}

