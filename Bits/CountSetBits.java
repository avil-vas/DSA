package Bits;

public class CountSetBits {
       
    public static int noSetBits(int n){
        int count=0;
        int bitMask=1;
        while(n!=0){//O(logn)
            if((n&bitMask)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    //fast
    public static int noSetBits1(int n) {
    int count = 0;

    while (n != 0) {
        n = n & (n - 1); // removes lowest set bit
        count++;
    }
    return count;
}

    public static void main(String[] args) {

        System.out.println(noSetBits1(10));
        
    }
    
}
