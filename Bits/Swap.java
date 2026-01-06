package Bits;
public class Swap {
    public static void  swap(int a,int b){
     a=a^b;
     b=a^b;
     a=a^b;
     System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a, b);
        //Add one to an integer
        //-x=~x+1;
        //-~x=x+1;
        System.out.println(-~a);
    }
}
