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
                           import java.util.Arrays;
                        System.out.println(Arrays.toString(arraysum.MaximumSubarray));
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
        int arr[] = { -2,1,-3,4,-1,2,1,-5,4 };
        int n = arr.length;
        int sum = 0;
        arraysum.MaximumSubarray(arr, n, sum);
       
    }
}
