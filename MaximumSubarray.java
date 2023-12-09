public class MaximumSubarray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        String[] partialNumbers = Arrays.copyOfRange(numbers, 0, 1); 
String[] partialNumbers = ArrayUtils.subarray(numbers, 0, 1);
List<String> NumbersList = Arrays.asList( Arrays.copyOfRange(numbers, 0, 1) );
        
        System.out.println(NumbersList);
    }
}

