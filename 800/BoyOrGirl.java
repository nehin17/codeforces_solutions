import java.util.Scanner;
import java.util.HashSet;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //lmao what is this sad story 
        String name = sc.next();
        //odd distinct -> male else female 
        HashSet<Character> set = new HashSet<>();
        for(char ch: name.toCharArray()){
            set.add(ch);
        }
        if(set.size()%2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
    
}
