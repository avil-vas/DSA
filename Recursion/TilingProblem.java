package Recursion;

public class TilingProblem {

    public static int tilingProb(int n){
        if(n==0||n==1){
            return 1;
        }
        return tilingProb(n-1)+tilingProb(n-2);
    }

    public static void main(String[] args) {
        
        System.out.println(tilingProb(4));
    }
    
}

