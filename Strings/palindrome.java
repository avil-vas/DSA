package Strings;

public class palindrome {
    public static boolean  checkPalindrome(String str){
        // int i=0,j=str.length()-1;

        // while(i<j){
        //     if(str.charAt(i)!=str.charAt(j)){
        //         System.out.println("String "+str+" is not palindrome");
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // System.out.println("String "+ str +" is palindrome");
        

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        String str="noona";
       System.out.println(checkPalindrome(str)); 
        
    }
}
