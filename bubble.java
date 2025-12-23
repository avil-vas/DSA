public class bubble {

    public static void bubbleSort(int a[]){
        int n=a.length,temp,j;
        boolean swap=false;
        for(int turn=0;turn<=n-2;turn++){
            
            for(j=0;j<=n-2-turn;j++){
                if(a[j]>a[j+1]){
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

    public static void selctionSort(int a[]){

        for(int i=0;i<a.length;i++){
            int minPos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minPos] > a[j]){
                    minPos=j;
                }
            }

            int temp=a[minPos];
            a[minPos]=a[i];
            a[i]=temp;
        }
    }
    public static void insertionSort(int a[]){

        for(int i=1;i<a.length;i++){
            int curr=a[i];
            int prev=i-1;

            while(prev>=0 && curr < a[prev]){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
    }
    public static void printArr(int a[]){
            System.out.println("Sorted array for you");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={1,5,3,4,2};
        insertionSort(a);
        printArr(a);
    }
    
}
