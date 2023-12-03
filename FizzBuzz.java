public class FizzBuzz {
    public static void main(String [] args) {
       int i;
for (int i = 0; i < 3; i++) {
            int el = numbers[i];
    if (el >= 3) {
        break;
    }
    System.out.println(el);
    if (el >= 1) {
        continue;
    }
    if (el % 3 == 0) {
    System.out.println("Fizz"); 
    }
    }
}
}
