class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] right=new int[nums.length];

        right[0]=1;
        for(int i=1;i<nums.length;i++){
            right[i]=right[i-1]*nums[i-1];

        }


int[] result=new int[nums.length];

int j=1;
for(int x=nums.length-1; x>=0; x--){
    result[x]=right[x]*j;
    j=j*nums[x];
}
    


return result;


        
    }
}  
