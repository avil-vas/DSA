package Bits;
public class BitOperations{

    public static int clearRangebits(int n,int i,int j){
      int a=(~0)<<j+1;
      int b=~((~0)<<i);
    //   int b=(1<<i)-1
      int bitMask=a|b;
      return n&bitMask;
    }
    public static void main(String[] args) {
        
        System.out.println(clearRangebits(10, 2, 7));
    }

}