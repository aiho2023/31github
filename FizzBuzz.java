public class FizzBuzz {
    public static void main(String[] args) {
       for (int i = 0; i < 3; i++) {
            if (i >= 3) {
        break;
    }
          System.out.println(i);
    if (i >= 1) {
        continue;
    }
           if (i % 3 == 0) {
    System.out.println("Fizz"); 
    }
    }
    }
}

