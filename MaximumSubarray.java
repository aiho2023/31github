public class MaximumSubarray {
   public static void main(String[] args); 
   static int[] copyArray1(){
  int[] numbers = {1,2,3,4,5,6,7};
  int[] subArray = Arrays.copyOfRange(numbers,3,numbers.length);
  System.out.println(Arrays.toString(subArray));
  return subArray;
}
}
