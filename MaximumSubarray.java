public class MaximumSubarray {
    void MaximumSubarray(int arr[], int n, int sum)
    {
        // Pick a starting point
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];
 
            if (currentSum == sum) {
                System.out.println("Sum found at indexe "
                                   + i);
                return;
            }
            else {
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];
 
                    if (currentSum == sum) {
                        System.out.println(
                            "Sum found between indexes " + i
                            + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
        return;
    }
 
    public static void main(String[] args)
    {
        MaximumSubarray arraysum = new MaximumSubarray();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        arraysum.MaximumSubarray(arr, n, sum);
    }
}
