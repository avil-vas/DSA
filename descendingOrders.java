public class descendingOrders {
    public static void bubbleSort(Integer a[]){
        int n=a.length,temp,j;
        for(int turn=0;turn<=n-2;turn++){
            boolean swap=false;
            for(j=0;j<=n-2-turn;j++){
                if(a[j]<a[j+1]){
                  temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
                  swap=true;
                }
            }
            if(!swap){
             break;
            }
        }
    }

    public static void selctionSort(Integer a[]){

        for(int i=0;i<a.length;i++){
            int minPos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minPos] < a[j]){
                    minPos=j;
                }
            }

            int temp=a[minPos];
            a[minPos]=a[i];
            a[i]=temp;
        }
    }
    public static void insertionSort(Integer a[]){

        for(int i=1;i<a.length;i++){
            int curr=a[i];
            int prev=i-1;

            while(prev>=0 && curr >a[prev]){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
    }

    public static void countSort(Integer a[]){
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
           maxValue= Math.max(maxValue, a[i]);

        }

        int count[]=new int[maxValue+1];
        //counting frequency by taking index of count array as the elements of the original array
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        //sorting
        int j=0;
        for(int i=count.length-1;i>=0;i--){

            while(count[i]>0){
                a[j]=i;
                count[i]--;
                j++;
            } 
        }
    }
    public static void printArr(Integer a[]){
            System.out.println("Sorted array for you");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer a[]={1,5,3,4,2,2,1,3,4,5,9};//this i used only to match the collections.order() because it doesnot work on primitive array means the array defined with primitive data type like int a[] 
        // bubbleSort(a);
        // selctionSort(a);
        // insertionSort(a);
        // Arrays.sort(a);//Sorts in ascending order
        // Arrays.sort(a,0,3);//Sorts elements from 0 to 2nd index

        // Arrays.sort(a,Collections.reverseOrder());

        //to do index wise decresing order

        // Arrays.sort(a,0,3,Collections.reverseOrder());

        //CountSort

        countSort(a);


        printArr(a);
    }
    
}
