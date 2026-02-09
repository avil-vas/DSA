package Backtracking;

public class Subests {
    public static void PrintSubsets(String s,String ans,int i){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        PrintSubsets(s, ans+s.charAt(i), i+1);
        PrintSubsets(s, ans, i+1);
    }
    
    public static void main(String[] args) {
      PrintSubsets("abc", "", 0);  
    }
}
