public class FizzBuzz1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        
        for (int i = 0; i < numbers.length; i++) {
            int el = numbers[i];

           System.out.println("Fizz");
            if (el % 3 == 0) {
                break;
            }
 if (el>=1) {
                System.out.println(el);
            }
           }
    }
}
    
