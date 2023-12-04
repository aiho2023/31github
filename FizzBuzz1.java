public class FizzBuzz1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        
        for (int i = 0; i < numbers.length; i++) {
            int el = numbers[i];
            
            System.out.println(el); 
            {
            continue;    
            }
           if (el % 3 == 0) {
            System.out.println("Fizz");
           }
    }
}
}    
