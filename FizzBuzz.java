public class FizzBuzz {
    public static void main(String[] args) {
       for (int i = 0; i < 4; i++) {
            if (i >= 4) {
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

