// class Solution {
//     public String largestNumber(int[] nums) {
//         for(int i =0 i < nums.length-1; i++){
            
//         }
//     }
// }
class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = String.valueOf(nums[i]);

        // Custom comparator: put "a+b" before "b+a" if a+b > b+a
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: all zeros -> "000" should become "0"
        if (arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : arr) sb.append(s);
        return sb.toString();
    }
}