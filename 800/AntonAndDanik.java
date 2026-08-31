import java.util.Scanner;
public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String outcomes = sc.next();
        int a=0;
        int d=0;
        for(char ch: outcomes.toCharArray()){
            if(ch=='A'){
                a++;
            }else{
                d++;
            }
        }
        if(a==d){
            System.out.println("Friendship");
        }else if(a>d){
            System.out.println("Anton");
        }else{
            System.out.println("Danik");
        }
        sc.close();
    }
    
}
