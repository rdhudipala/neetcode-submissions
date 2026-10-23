class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> unique=new HashMap<>();
        int left=0;
        int maxLength=0;

        for(int right=0; right<s.length(); right++){

            char c=s.charAt(right);

             if (unique.containsKey(c)) {
                left = Math.max(left, unique.get(c) + 1);
            }
             int length = right-left+1;

             maxLength=Math.max(maxLength, length);
             unique.put(c, right);



        }
        

        return maxLength;
    }
}
