// time complexity 0(n)
// space complexity 0(1)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums.length==0 || nums==null)
        {
            return new ArrayList<>();
        }
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index]>=0)
            {
                nums[index]=(nums[index]*-1);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                result.add(i+1);
            }
        }
        return result;

    }
}