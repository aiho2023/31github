public class FizzBuzz {
    public static void main(String[] args) {
int i;
        
          for (int i = 0; i < 3; i++) {
            if (i >= 3) {
        break;
    }
    System.out.println(i);
    if (i % 3 == 0) {
        continue;
    }
    System.out.println("Fizz"); 
    }
}
}

