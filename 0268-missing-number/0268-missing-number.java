class Solution {
    public int missingNumber(int[] nums) {
     int supposedCount=0;
      int n=nums.length;
      supposedCount=n*(n+1)/2;
    //  now finding an the sum of all the ACTUAL NUMBER in the array

    int actualCount=0;
    for(int num:nums ){
        actualCount+=num;
      
    }
    int missingNumber=supposedCount-actualCount;
    return missingNumber;

     }
    
}

