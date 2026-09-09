//two sum problems 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        //while using for loop i more easy as compare to while loop
        int[] sum=new int[]{};
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    sum=new int[]{i,j};
                }
            }
        }
        return sum;

    }    
       
        
}
