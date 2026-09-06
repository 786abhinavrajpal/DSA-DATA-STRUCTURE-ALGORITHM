class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
 
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        if(nums[i]+nums[j]+nums[k] == 0){
                            //this line should be new for me 
                            list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        }

                        


                    }
                }
            }
        }
        return list;       
    }
}