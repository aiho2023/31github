public class FizzBuzz1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        
        for (int i = 0; i < numbers.length; i++) {
            int el = numbers[i];

            if (el == 4) {
                break;
            }
 System.out.println(i);
    if (el >= 1) {
        continue;
    }    
      if (el % 3 == 0) {
            System.out.println("Fizz");
      }

        }
    }
}
    
