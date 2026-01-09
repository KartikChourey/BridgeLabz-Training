// LEETCODE 136 
// Single Element

class Solution {
    public int singleNumber(int[] nums) {
      
        int ans =0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) set.remove(num);
           else  set.add(num);
        }
        for(int s : set) ans = s;
  return ans ;
    }
}