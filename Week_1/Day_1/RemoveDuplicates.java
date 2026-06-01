class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count=0;
        int j=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                nums[j]=nums[i];
                j++;
                count++;
            }
        }
        for(j=0;j<n;j++){
            System.out.println(nums[j]);
        }
        return count+1;
    }
}
