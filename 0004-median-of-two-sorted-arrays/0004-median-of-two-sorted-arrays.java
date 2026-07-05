class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m =nums1.length;
        int n= nums2.length;
        int[]merge=new int [m+n];
        int i=0;
        int j=0;
        int k=0;

        while (i<m && j< n){
        
        if (  nums1[i]< nums2[j]){
            
            merge[k]=nums1[i];
            i++;
        }
        
        else{
           
            merge[k]=nums2[j];
            j++;
        }
        k++;
    }
    while(i<m){
       
            merge[k]=nums1[i];
            i++;
            k++;
    }
    while (j<n){

            merge[k]=nums2[j];
            j++;
            k++;
    }
int total = merge.length;
int mid=total /2;

if ( total % 2 ==0){
  return (merge[mid-1] + merge[mid])/2.0;
}
else{ 
    return merge[mid];
}




        

    }
}