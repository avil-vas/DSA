public class spiralMatrix {
      
    public static void spiralMatrix(int a[][]){
       int startRow=0;
       int endRow=a.length-1;
       int endCol=a[0].length-1;
       int startCol=0;

       while(startRow<=endRow && startCol<=endCol){
        //top
        for(int j=startCol;j<=endCol;j++){
            System.out.print(a[startRow][j]+" ");
        }
        //right
        for(int i=startRow+1;i<=endRow;i++ ){
        System.out.print(a[i][endCol]+" ");
        }
        //bottom

        for(int j=endCol-1;j>=startCol;j--){
            if(startRow==endRow){
                return;
            }
            System.out.print(a[endRow][j]+" ");
        }

        //left

        for(int i=endRow-1;i>=startRow+1;i--){
            if(startCol==endCol){
                return;
            }
            System.out.print(a[i][startCol]+" ");
        }

        startRow++;
        endRow--;
        startCol++;
        endCol--;
       }
    }
    
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMatrix(a);
    }
    
}
