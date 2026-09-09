class Solution {
    public int singleNumber(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length ; i++){
            //binary number XOR ho raha h ^ ye function yaad rakhe ge 
            num= num^nums[i];

        }
        return num;
        
        
    }
}