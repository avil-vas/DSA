package DivideAndConquer;

public class SortedRotated {

    public static int tarSearch(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }

        int mid=si+(ei-si)/2;

        //case found
        if(arr[mid]==target){
            return mid;
        }
        //mid on line 1
        if(arr[si]<=arr[mid]){
            //case a:left
            if(arr[si]<=target&&target<=arr[mid]){
                return tarSearch(arr, target, si, mid-1);

            }
            else{
             //case b:right
             return tarSearch(arr, target, mid+1, ei);
            }
        }
        //line 2
        else{
            //case c
             if(arr[mid]<=target&&target<=arr[ei]){
                return tarSearch(arr, target, mid+1, ei);

            }
            else{
             //case d:left
             return tarSearch(arr, target, si, mid-1);
            }
        }

    }

    public static int tarSearchUsingLoops(int arr[],int target,int si,int ei){
        
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]==target){
            return mid;
        }
        //mid on line 1
        if(arr[si]<=arr[mid]){
            //case a:left
            if(arr[si]<=target&&target<=arr[mid]){
              ei=mid-1;

            }
            else{
             //case b:right
             si=mid+1;
            }
        }
        //line 2
        else{
            //case c
             if(arr[mid]<=target&&target<=arr[ei]){
                si=mid+1;

            }
            else{
             //case d:left
             ei=mid-1;
            }
        }

        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=10;
    //    int tindx= tarSearch(arr, target, 0, arr.length-1);
    int tindx=tarSearchUsingLoops(arr, target, 0, arr.length-1);
    System.out.println(tindx);   }
    
}
