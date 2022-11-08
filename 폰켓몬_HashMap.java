import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {

        HashMap map = new HashMap();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int count = (int)map.get(nums[i]);
                map.put(nums[i],count+1);
            }else{
                map.put(nums[i],1);
            }
        }
        
        if(map.size()<nums.length/2) return map.size();
        return nums.length/2;
    }
}
