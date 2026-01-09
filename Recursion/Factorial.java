package Recursion;

public class Factorial {
    
    public static int facorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*facorial(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println(facorial(5));
    }
}
