class Solution {
    public List<Integer> findDuplicates(int[] nums) {
          List<Integer> list1 = new ArrayList<>();
        int n=nums.length;
            Arrays.sort(nums);

        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){

                 list1.add(nums[i]);

            }



        }

        return list1;
        
    }
}