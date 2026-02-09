public class UniqueArray {

    public static int uniqueArray(int nums[]){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];

            }
        }
        return i+1;
     
    }

    public static void main(String[] args) {

        int nums[]={1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,5,6,7,7,8};
       System.out.println( uniqueArray(nums));

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        
    }
    
}
