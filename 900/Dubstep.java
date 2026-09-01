import java.util.Scanner;
public class Dubstep {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String remix = sc.next();
        String song = remix.replace("WUB", " ");
        //removes whitespaces from both end and beginning 
        song.trim();
        System.out.println(song);
        sc.close();
    }
    
}

