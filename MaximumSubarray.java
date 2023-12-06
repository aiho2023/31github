  public static int[] MaximumSubarray(){
  int[] numbers = {1,2,3,4,5,6,7};
  int[] subArray = Arrays.copyOfRange(numbers,3,numbers.length);
  System.out.println(Arrays.toString(subArray));
  return subArray;
}
