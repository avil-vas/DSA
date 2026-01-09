package Recursion;
//First occurence of a key in an array
public class FO {

    public static int fOccurence(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }

        return fOccurence(a, key, i+1);
    }

     public static int lOccurence(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }
        //look forward
        int isfound=lOccurence(a, key, i+1);
        //compare with itself
        if(isfound==-1&&a[i]==key){
            return i;
        }

        return isfound;
    }
       public static int lastOccurence(int a[],int key,int i){
        if(i<0){
            return -1;
        }
        //look forward
        //compare with itself
        if(a[i]==key){
            return i;
        }

        return lastOccurence(a, key, i-1);
    }

    public static void main(String[] args) {
        int a[]={3,5,4,5,6,6,6,5,5,5,4,4,4,6,6,5,6,5,4,4,4,4};
        System.out.println(fOccurence(a, 51, 0));
        System.out.println(lOccurence(a, 51, 0));
          System.out.println(lastOccurence(a, 51,a.length-1));
        
    }
    
}
