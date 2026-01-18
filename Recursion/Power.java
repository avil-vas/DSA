package Recursion;

public class Power {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }

      public static int powerOptimized(int x,int n){
        if(n==0){
            return 1;
        }
        int res=powerOptimized(x, n/2);
        if((n&1)==0){
            return res*res;
        }
        else{
            return x*res*res;
        }
       
    }
    public static void main(String[] args) {
        
        System.out.println(powerOptimized(3, 10));
        System.out.println(power(3, 10));
        
    }
}
