import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
      for (int i=0;i<nums.length;i++){
          for (int j=0;j<nums.length;j++){
            if (i != j){
                if ((nums[i]+nums[j])==target){
                    int arr[] = new int[]{i,j};
                    return arr;
                }
            }  
          } 
      } 
     return null;
    }
    public static void main(String[] args){
        TwoSum s = new TwoSum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        String[] tokens = sc.nextLine().split(",");
        int nums[] = new int[tokens.length];
            for (int i=0;i<tokens.length;i++){
                nums[i] = Integer.parseInt(tokens[i]);
            }
        /*for (int i=0;i<tokens.length;i++){
            System.out.println(arr[i]);
        */
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(s.twoSum(nums,target)));
    
    }
}