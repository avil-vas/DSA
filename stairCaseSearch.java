public class stairCaseSearch {

    public static boolean  stairCase(int a[][],int key){
         int i=0,j=a[0].length-1;

         while(i<a.length && j>=0){
            if(a[i][j]==key){
                System.out.println("The key "+key+" found at cell ("+i+","+j+") ");
                return true;
            }
            else if(key<a[i][j]){
                j--;
            }
            else{
                i++;
            }
         }
         System.out.println("key not found");
        return false;

    }
    public static void main(String[] args) {
        int a[][]={{10,20,30,40},
                {15,25,35,45},
            {27,29,37,48},{32,33,39,50}};
       int key=33;
       stairCase(a, key);
    }
}
