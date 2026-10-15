class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //FingerPrints of strings--> strings list associated with it
        HashMap<String, List<String>> anagramArray=new HashMap<>();

        for(int i=0; i<strs.length; i++){

           String   currentFingerprint=Arrays.toString(calcFingerprint(strs[i]));
            anagramArray.computeIfAbsent(currentFingerprint, k->new ArrayList<>()).add(strs[i]);

        }

        return new ArrayList<>(anagramArray.values());

        
    }



    public int[] calcFingerprint(String str){
int[] countIndices=new int[26];

for(char ch:str.toCharArray()){
    countIndices[ch-'a']++;
}

return countIndices;
    }
}
