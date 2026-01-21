public class Kfrequent {
     
    public static  int[] topKFrequent(int[] nums, int k) {
        int arr[]=new int[k];
        HashMap<Integer,Integer> map=new HashMap;
        Map.put(a[0],1);
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(a[i])){
                 map.put(a[i], map.get(a[i]) + 1);
            }
            else{
                map.put(a[i],1);
            }

        }
        
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4};
        topKFrequent(arr, 2);
        
    }
}