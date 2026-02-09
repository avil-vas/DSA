public class prefixSum{
    public static  void  subarray(int a[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        //Calculate PrefixArray
        int prefix[]=new int[a.length];
        prefix[0]=a[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
          
        //MaxSubarray
       
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
                int end=j;
                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];

                if(maxSum<currSum){
                    maxSum=currSum;
                }

                //Magic happens here lol

          
            }
           
        }
        System.out.println("Maximum subarray Sum is "+maxSum);


   
    }
      
public static void main(String[] args) {
     
 int a[]={1,-2,6,-1,3};
 
subarray(a);
}
}