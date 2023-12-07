public class main {

    private static void subArray(int[] array, int startIndex, int endIndex){
        int[] result = ArrayUtils.subarray(array, startIndex, endIndex);
        System.out.print("SubArray for " + startIndex + " and " + endIndex + " is [ ");
        for(int i: result) System.out.print(i + " ");
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.print("Original Array is - [ ");
        for(int i:array) System.out.print( i + " ");
        System.out.println("]");
        subArray(array, 0, 3);
        subArray(array, -1, 3);
        subArray(array, 10, 20);
        subArray(array, 0, -5);
        subArray(array, 0, 10);
    }
}

