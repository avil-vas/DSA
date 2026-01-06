package Bits;

public class PowerofTwo {
     
    public static void isPowerOfTwo(int n){
        if((n&(n-1))==0){
            System.out.println("Power of two");
        }
        else{
            System.out.println("Not a power of two");
        }
    }
    public static void main(String[] args) {
        isPowerOfTwo(4);
        
    }
    
}
