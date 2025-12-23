public class TrappingRain {

    public static int trappedRainwater(int height[]){
    //calculate LeftMaxBoundary
    int leftMax[]=new int[height.length];
    int rightMax[]=new int[height.length];
    int tw=0;

    leftMax[0]=height[0];
    for(int i=1;i<height.length;i++){
        leftMax[i]=Math.max(height[i], leftMax[i-1]);

    }

    rightMax[height.length-1]=height[height.length-1];
    for(int i=height.length-2;i>=0;i--){
        rightMax[i]=Math.max(height[i], rightMax[i+1]);

    }
    //Calculating Trapped Rain Water
    for(int i=0;i<height.length;i++){
        tw+=(Math.min(leftMax[i], rightMax[i])-height[i]);
    }

     return tw;
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int a=trappedRainwater(height);
        System.out.println("Total trapped rain water is"+a);

    }
    
}
