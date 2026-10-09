

class Solution {
    class QuickSort {
    public void quicksort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = partition(nums, low, high);
        quicksort(nums, pivot + 1, high);
        quicksort(nums, low, pivot - 1);
    }

    public int partition(int[] nums, int low, int high) {
        int i = low - 1;
        int j = 0;
        int pivot = nums[high];

        for (j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        i++;
        int temp = nums[i];
        nums[i] = nums[high];
        nums[high] = temp;

        return i;
    }
}
    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        QuickSort qs = new QuickSort();
        qs.quicksort(nums, low, high);
        return nums;
    }
}