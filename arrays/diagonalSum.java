public class diagonalSum {
    public static void diagonalSum(int a[][]){
        int sum=0;
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         if(i==j){
        //             sum+=a[i][j];
        //         }
        //         else if(i!=j&&i+j==(a.length-1)){
        //             sum+=a[i][j];
        //         }
        //     }
        // } Time complexity o(n^2)

        // We can solve this in o(n)

        for(int i=0;i<a.length;i++){
            sum+=a[i][i];

            if(i!=a.length-i-1){
                sum+=a[i][a.length-1-i];
            }

        }

        System.out.println("Diagonal sum is "+ sum);

    }

      public static void main(String[] args) {
        int a[][]={{10,20,30,40},
                {15,25,35,45},
            {27,29,37,48},{32,33,39,50}};
        diagonalSum(a);
    }
    
}
