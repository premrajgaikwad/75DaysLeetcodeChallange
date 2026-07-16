class Solution {
    public int findLucky(int[] arr) {
        int [] carr= new int[501];
        for(int n :arr){
            carr[n]++;

        } 
        for ( int i =500 ; i>0 ; i--){
            if( i == carr[i])
                return i;
            
        }
        return -1;
    }
}