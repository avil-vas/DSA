class Mul {
    public static int[] productExceptSelf(int[] nums) {

        int res[]=new int[nums.length];
        int prod=1;
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                prod=prod*nums[j];
              
                }
            }
            res[i]=prod;
            prod=1;
        }
         return res;
    }
    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        print(productExceptSelf(nums));

    }
   
}