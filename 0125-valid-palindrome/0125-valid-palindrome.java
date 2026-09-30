class Solution {
    public boolean isPalindrome(String s) {
        String clean=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return isPalindrome(clean,0,clean.length()-1);

    }

        public boolean isPalindrome(String clean,int left,int right){
            if ( left >= right){
                 return true;
            }

            if( clean.charAt(left)!= clean.charAt(right)){
                return false;
            }
            return isPalindrome(clean,left + 1, right-1);

        }
}