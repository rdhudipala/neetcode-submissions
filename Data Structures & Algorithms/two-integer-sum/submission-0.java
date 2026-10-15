class Solution {
    public int[] twoSum(int[] nums, int target) {


//value---> index

HashMap<Integer, Integer> mapIndices=new HashMap<>();


for(int i=0; i<nums.length; i++){

    int complement=target-nums[i];
    if(mapIndices.containsKey(complement)){
        return new int[]{mapIndices.get(complement), i};
    }

    mapIndices.put(nums[i],i);

}

return new int[0];

    }
}
