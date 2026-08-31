import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text = sc.next();
        int lower =0;
        int upper = 0;
        for(char ch:text.toCharArray()){
            if(Character.isUpperCase(ch)){
                upper++;
            }else{
                lower++;
            }
        }
        if(upper> lower){
            System.out.println(text.toUpperCase());
        }else{
            System.out.println(text.toLowerCase());
        }
        sc.close();
    }
    
}

