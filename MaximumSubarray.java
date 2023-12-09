public class MaximumSubarray {
    public static void main(String[] args) {
       String[] names = {"Alex", "Brian", "Charles", "David"};
 
//Subarray from index '0' (inclusive) to index '2' (exclusive)
String[] partialNames = Arrays.copyOfRange(names, 0, 2);  // [Alex, Brian]

// Using Common Lang
String[] partialNames = ArrayUtils.subarray(names, 0, 2);    // [Alex, Brian]
 
//Subarray to List
List<String> namesList = Arrays.asList( Arrays.copyOfRange(names, 2, names.length) );
        
        System.out.println(NamesList);
    }
}

