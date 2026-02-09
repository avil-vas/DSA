public class KadensAlgo {
    // static void MaxSubarray(int a[]){
    //     boolean negative=false;
    //     for(int i=0;i<a.length;i++){
    //         if(a[i]>0){
    //             negative=true;
    //             break;

    //         }
    //     }
    //     if(negative==false){
    //         System.out.println("Maximum sum "+Arrays.stream(a).max().getAsInt());
    //     }
    //     else{
    //     int currSum=0;
    //     int maxSum=Integer.MIN_VALUE;
    //     for(int i=0;i<a.length;i++){
    //        currSum+=a[i];

    //        if(currSum <0){
    //         currSum=0;
    //        }
    //        maxSum=Math.max(currSum, maxSum);
    //     }
    //     System.out.println("Maximum sum "+maxSum);
    // }

    public  static void MaxSubarray(int a[]){
        int currSum=a[0];
        int maxSum=a[0];
        for(int i=1;i<a.length;i++){
            currSum=Math.max(a[i], currSum+a[i]);
            maxSum=Math.max(currSum, maxSum);
        }
         System.out.println("Maximum sum "+maxSum);
    }
    

    public static void main(String[] args) {
        int a[]={-2,-1,-7,7,8};
        MaxSubarray(a);
        
    }
}

