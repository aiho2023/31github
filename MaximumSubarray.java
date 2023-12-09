public class MaximumSubarray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int length = numbers[2];
String[] partialNumbers = Arrays.copyOfRange(numbers, 0, 1); 
String[] partialNumbers = ArrayUtils.subarray(numbers, 0, 1);
List<String> NumbersList = Arrays.asList( Arrays.copyOfRange(numbers, 0, numbers.length) );
        
        System.out.println(NumbersList);
    }
}

