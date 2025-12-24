import java.util.*;
public class twodArrays {
     
    public static void insert(){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("Enter the array elements ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                 a[i][j]=sc.nextInt();
            }
        }
        display(a);
        System.out.println(a[0]);
         System.out.println(a[1]);
          System.out.println(a[2]);

    }
    
    public static void display(int a[][]){
       for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" "); 
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        
        insert();
        
    }
}
