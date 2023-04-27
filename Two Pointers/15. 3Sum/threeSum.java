class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s= new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();
        int target = 0;
        int low,high,triples;
        Arrays.sort(nums);
        for(int i=0;i<nums.length - 2;i++){
            low = i+1;
            high = nums.length-1;
            while(low<high){
                triples = nums[i]+nums[low]+nums[high];
                if(triples==target){
                    s.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                }else if(triples<target){
                    low++;
                }else high--;


            }
            
        }
        output.addAll(s);
        return output;
    }
}
