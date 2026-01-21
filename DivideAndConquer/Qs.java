package DivideAndConquer;

public class Qs {
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
       
        int piviot=partition(arr,si, ei);
        quickSort(arr, si,piviot-1);
        quickSort(arr, piviot+1, ei);
       

    }
     
    public static int partition(int arr[],int si,int ei){
        int piviot=arr[ei];
        int i=si-1,j=si;
        while(j<ei){
            if(arr[j]<=piviot){
                i++;
                swap(arr, j, i);
            }
            j++;
        }
        i++;
        swap(arr, ei, i);
    
       
        return i;
    }


    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        
    }
    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,87,67,-1,2,0};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
        
    }
    
}
