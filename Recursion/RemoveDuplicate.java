package Recursion;

public class RemoveDuplicate {
    public static void removeDuplicate(String str,int i,StringBuilder s,boolean map[]){
        if(i==str.length()){
            System.out.println(s);
            return;
        }
        char ch=str.charAt(i);
        if(map[ch-'a']!=true){
            map[ch-'a']=true;
            removeDuplicate(str, i+1, s.append(ch), map);
        }
        else{
            removeDuplicate(str, i+1, s, map);
        }
    }

    public static void main(String[] args) {

        String str="aavvilvaassseeerrr";
        removeDuplicate(str, 0, new StringBuilder(), new boolean[26]);
        
    }
    
}
