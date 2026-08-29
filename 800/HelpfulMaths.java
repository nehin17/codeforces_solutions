import java.util.Scanner;
public class HelpfulMaths{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[3];
        StringBuilder ans = new StringBuilder();
        for(char ch: str.toCharArray()){
            if(ch == '+'){
                continue;
            }else if(ch == '1'){
                arr[0]++;
            }else if(ch == '2'){
                arr[1]++;
            }else{
                arr[2]++;
            }
        }
        for(int i=0; i<3; i++){
            while(arr[i]>0){
                ans.append( i +1).append('+');
                arr[i]--;
            }
        }
        ans.deleteCharAt(ans.length()-1);
        System.out.println(ans.toString());

        sc.close();
    }
    
}
