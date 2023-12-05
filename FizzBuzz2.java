public class FizzBuzz2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        
        for (int i = 0; i < numbers.length; i++) {
            int el = numbers[i];
          if (el%3==0||el%5==0){ 
           System.out.println("FizzBuzz");
             } 
         else if (el%3==0){ 
            System.out.println("Fizz"); 
         }
           else if (el%5==0){ 
            System.out.println("Buzz"); 
         }
          else if (el>=1){ 
            System.out.println(el); 
         }
    }
}
}    
