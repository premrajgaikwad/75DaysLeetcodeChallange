class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
      int  last=-1;
        int n = nums.length;
        // finding first position 
        for ( int i =0 ; i<n ; i++){
            if( nums[i]==target){
                first=i;
                break;
            }
        }
        //  for finding gth elast postion 
        for ( int j=n-1; j>=0; j--){
            if (nums[j]==target){
                last =j;
                break;
            }
        }
        return new int []{first,last};
    }
}