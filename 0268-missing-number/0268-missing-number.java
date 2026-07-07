class Solution {
    public int missingNumber(int[] nums) {
      int n =nums.length;
       int supposedCount=0;
       supposedCount=n*(n+1)/2;


       int actualCount=0;
       for( int num:nums){
        actualCount+=num;
       }
       int missingNumber=supposedCount-actualCount;
       return missingNumber;

     }
    
}