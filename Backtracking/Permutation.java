package Backtracking;

public class Permutation {
    public static void printPermutation(String s,String ans){
        if(s.length()==0){
          System.out.println(ans);
          return;
        }
        for(int i=0;i<s.length();i++){
           char curr=s.charAt(i);
           String newStr=s.substring(0,i)+s.substring(i+1);
           printPermutation(newStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        printPermutation("abc", "");
    }
    
}
