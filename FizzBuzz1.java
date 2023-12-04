public class FizzBuzz1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        
        for (int i = 0; i < numbers.length; i++) {
            int el = numbers[i];

            if (el == 3) {
                break;
            }

            // using the division remainder operator %
            if (el % 3 == 0) {
                System.out.println("Fizz");
            }

        }
    }
}
    }
}
