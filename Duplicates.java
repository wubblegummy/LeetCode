import java.util.*;
class Duplicates {
    public int removeDuplicates(int[] nums) {
        int orgnum = nums.length;
        int n = nums.length;
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n;j++){
                if (nums[i] == nums[j]){
                    for (int k = j+1; k<n; k++){
                        nums[k-1] = nums[k];
                    }
                        n--;
                        j--;
                }
            }
        }
        System.out.println(n);
        for (int i = 0; i<n; i++){
            System.out.print(nums[i]);
            System.out.print(" ");
        }
        for (int i= 0;i<(orgnum-n);i++){
            System.out.print("_ ");
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Duplicates s = new Duplicates();
        System.out.println("Enter the array: ");
        String[] input = sc.nextLine().split(",");
        int n = input.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(input[i]);
        }
        s.removeDuplicates(nums);
        sc.close();
    }
}
