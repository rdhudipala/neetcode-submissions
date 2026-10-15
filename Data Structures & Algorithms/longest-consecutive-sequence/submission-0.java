class Solution {
    public int longestConsecutive(int[] nums) {
int maxCount=0;

Set<Integer> seen=new HashSet<>();

for(int i=0; i<nums.length; i++){

    seen.add(nums[i]);
}

for(int num:nums){
    if(seen.contains(num-1))continue;
    int count=1;
    int x=num;
    while(seen.contains(x+1)){
        x+=1;        
        count++;     

    }
    maxCount=Math.max(count, maxCount);

}

  return maxCount;      
        
    }
}
