package Bits;

public class EvenOdd {
    public static void isEvenorOdd(int n){
        int bitMark=1;
        if((n&bitMark)==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(5&2);//and
        System.out.println(5|2);//or
        System.out.println(5<<2);//leftshift
        System.out.println(5>>2);//right shift
        System.out.println(~5);//1s complement
        isEvenorOdd(n);
    }
    
}
