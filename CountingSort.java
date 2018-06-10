public class CountingSort {
    public static void main(String[] args) {
        int[] nums = { 4, 99999, 5, 7, 8, 6, 7, 8, 9, 1000000 };

        showArray(nums);

        countingSort(nums, 4, 1000000);

        showArray(nums);
    }

    public static void countingSort(int[] nums, int min, int max) {
        int[] countArray = new int[max - min + 1];

        for (int i = 0; i < nums.length; i++) {
            countArray[nums[i] - min]++;
        }

        int j = 0;

        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                nums[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    private static void showArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}