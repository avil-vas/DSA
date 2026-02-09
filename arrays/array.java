public class array{
    public static  void  subarray(int a[]){
          
        int k[]=new int[a.length*(a.length+1)/2];
        int sum=0,l=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int z=i;z<=j;z++){
                    System.out.print(a[z]+" ");
                    sum+=a[z];
                }
                k[l++]=sum;
                sum=0;
                System.out.print(" ");
            }
            System.out.println("");
        }
        int la=Integer.MIN_VALUE;
        int s=Integer.MAX_VALUE;
        for(int i=0;i<a.length*(a.length+1)/2;i++){
            if(k[i]>la){
                la=k[i];
            }
            if(k[i]<s){
                s=k[i];
            }
        }
        System.out.println("Largest sum of subarray is "+la);
         System.out.println("Smallest sum of subarray is "+s);


   
    }
      
public static void main(String[] args) {
     
 int a[]={1,-2,6,-1,3};
 
  System.out.println("All possible subarrays in tha array");
 subarray(a);

 System.out.println("");

}
}