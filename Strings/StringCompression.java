package Strings;
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
    public static void main(String[] args) {
        String str="aaabbccccc";
        System.out.println(stringCompression(str));
        
    }
}