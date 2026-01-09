package Recursion;

public class DEC {


    public static void Decrement(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Decrement(n-1);
    }

     public static void Increment(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        Increment(n-1) ;
        System.out.println(n );
        
    }

    

    public static void main(String[] args) {
        Decrement(10);
        Increment(10);
        
    }
    
}
