package test;

public class quickSort {
    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void quickSort(int[] nums,int left,int right){
        if(left >= right) return;
        int temp = nums[left];
        int begin = left;
        int end = right;
        while(left < right){
            while(temp >= nums[left] && left<right){
                left++;
            }
            while(temp <= nums[right] && left<right){
                right--;
            }
            int mid = nums[left];
            nums[left] = nums[right];
            nums[right] = mid;
        }
        nums[begin] = nums[left];
        nums[left] = temp;
        quickSort(nums,begin,left);
        quickSort(nums,left+1,end);
    }

    public static void main(String[] args) {
        int[] nums={5, 2, 3, 1};
        sortArray(nums);
        for (int i=0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
