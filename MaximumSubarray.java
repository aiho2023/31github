public class MaximumSubarray {
   
       public static int[] copyArray(){
       int[] numbers = {1,2,3,4,5,6,7};
       int[] subArray = new int[numbers.length-3];
       int j =3;
       for (int i=0;i<subArray.length;i++){
           subArray[i] = numbers[j+i];
       }
       System.out.println(Arrays.toString(subArray));
       return subArray;
   }
}
