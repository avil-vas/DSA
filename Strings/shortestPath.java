package Strings;

public class shortestPath {
      
    public static void shortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
               y--;
            }
             else if(str.charAt(i)=='W'){
               x--;
            }
             else if(str.charAt(i)=='E'){
               x++;
            }
        }
        int n=((x*x)+(y*y));
        System.out.println(n);
        System.out.println("Shortest path from the origin to the point ("+x+","+y+")"+"is "+Math.sqrt(n)+"units");
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        shortestPath(str);
    }
    
}
