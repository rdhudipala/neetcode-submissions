class Solution {
    public int trap(int[] height) {


        int totalWater=0;
        int[] leftMax=new int[height.length];
        int[] rightMax=new int[height.length];
        leftMax[0]=height[0];
        rightMax[height.length-1]=height[height.length-1];

        for(int i=1; i<height.length; i++){
            leftMax[i]=Math.max(leftMax[i-1], height[i]);
        }

        for(int j=height.length-2; j>=0; j-- ){
            rightMax[j]=Math.max(rightMax[j+1], height[j]);
        }

for(int k=0; k<height.length; k++ ){
    int kLevel=Math.min(rightMax[k], leftMax[k]);
    int kWater=kLevel-height[k];
    totalWater+=kWater;
}

return totalWater;
        
    }
}
