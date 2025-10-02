import java.util.*;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        int start = 0, end = l-1,mid;
        while (start<=end){
            mid = start + (end-start)/2;
            if (target<nums[mid]){
                end = mid-1;
            }
            else if (target>nums[mid]){
                start = mid+1;
            }
            else if(!(target>nums[mid])&&!(target<nums[mid])){
                System.out.println(mid+1);
                return mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        System.out.println("Enter the array elements: ");
        String[] input = sc.nextLine().split(",");
        int[] nums = new int[input.length];
        for (int i = 1;i<input.length;i++){
            nums[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Enter element to be inserted: ");
        int target = sc.nextInt();
        s.searchInsert(nums,target);
        sc.close();
    }
}
/*find the length of the array.
check whether target element is lesser than or greater than the mid value.
1 3 5 6 8
2
if it is not lesser or greater than the mid value, start+1 is the value where the element has to be inserted
increase array size */
