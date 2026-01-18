package Recursion;

public class Occurance {
    public static void occuranceOfNumber(int a[],int key,int i){
        if(i==a.length){
            return;
        }
        if(a[i]==key){
            System.out.println(i);
            
        }
        occuranceOfNumber(a, key, i+1);
    }

    public static void coverToString(String str,int i,String map[],StringBuilder s){
       if(i==str.length()||str.charAt(str.length()-1)=='0'){
        System.out.println(s);
        return;
       }
       coverToString(str, i+1, map,s.append(map[str.charAt(i)-'0']).append(" "));
    }

    public static void main(String[] args) {
        // int a[]={3,2,4,5,6,2,7,2,2};
        // occuranceOfNumber(a, 2, 0);

        String map[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        coverToString("1949", 0, map,new StringBuilder(""));


        
    }
    
}
