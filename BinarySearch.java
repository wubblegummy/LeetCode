import java.util.*;
class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high){
            int mid = low + (high-low)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinarySearch s = new BinarySearch();
        System.out.println("Enter the array elements: ");
        String[] input = sc.nextLine().split(",");
        int[] nums = new int[input.length];
        for(int i = 0; i<input.length;i++){
            nums[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        int result = s.search(nums,target);
        System.out.println(result);
        sc.close();
    }
}
