import java.util.*;

public class StringCompression{

    public static String stringCompression(String str){
        int count=1;
        char ch;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){

           while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
            
           }
        sb.append(str.charAt(i));
           if(count>1){
               sb.append(count);
           }
    
           count=1;
        }
        return sb.toString();
    } 

    public static boolean  isAnagram(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        char ch[]=str1.toCharArray();
        Arrays.sort(ch);

        char ch1[]=str2.toCharArray();
        Arrays.sort(ch1);
       
        if(Arrays.equals(ch,ch1)){
            return true;
            
        }
     
        return false; 
    }
    public static void main(String[] args) {
        String str="aaabbccccc";
        System.out.println(stringCompression(str));
        // String str1=str.replace('a', 'e');
        // String str2=str.replace("aa", "kk");
         
        
        // System.out.println(str1);
        //   System.out.println(str2);
        
        System.out.println(isAnagram("race","care"));
        
    }
}