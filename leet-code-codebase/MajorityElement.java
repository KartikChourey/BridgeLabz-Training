// Leetcode 169 

class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int n=nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }
            else{
                mp.put(nums[i],mp.get(nums[i])+1);
            }
        }
        for(var v : mp.entrySet()){
            if(v.getValue()>(n/2))  ans=v.getKey();
            
            
        }
        return ans;
    }
}