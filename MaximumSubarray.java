public class MaximumSubarray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        Int[] partialNumbers = Arrays.copyOfRange(numbers, 0, 1); 
Int[] partialNumbers = ArrayUtils.subarray(numbers, 0, 1);
List<Int> NumbersList = Arrays.asList( Arrays.copyOfRange(numbers, 0, 1) );
        
        System.out.println(NumbersList);
    }
}

