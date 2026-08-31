import java.util.Scanner;
public class AntonAndPolyhedrons{
    /* QUESTIONS RELATED INFORMATION 
    Tetrahedron. Tetrahedron has 4 triangular faces.
    Cube. Cube has 6 square faces.
    Octahedron. Octahedron has 8 triangular faces.
    Dodecahedron. Dodecahedron has 12 pentagonal faces.
    Icosahedron. Icosahedron has 20 triangular faces.
     */
    public static void main(String[] args) {
        //slight optimizqationw oudl be to use long instead of int 
        //for large input 
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int total=0;
        for(int i=0; i<n; i++){
            String shape = sc.next();
            if(shape.equals("Tetrahedron")){
                total+=4;
            }else if(shape.equals("Cube")){
                total+=6;
            }else if(shape.equals("Octahedron")){
                total+=8;
            }else if(shape.equals("Dodecahedron")){
                total+=12;
            }else{
                total+=20;
            }
        }
        System.out.println(total);
        sc.close();
    }
    
}

