public class PalindromeString{
   public static void main(String args[]){
      String Str = new String("Добро пожаловать на ProgLang.su");

      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.replaceAll("(.*)Добро пожаловать на ProgLang.su(.*)",
                         "IAMAIHO"));
      
      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.replaceAll("ProgLang.su",
                         "сайт посвященный программированию!"));

       StringBuffer buffer = new StringBuffer("А роза упала на лапу Азора");
       buffer.reverse();
       System.out.println(buffer);

      StringBuffer strBuffer = new StringBuffer("Добро пожаловать на ProgLang.su");
      System.out.println(Str.toString());

      StringBuffer strBuffer1 = new StringBuffer("Java");
      char c = strBuffer1.charAt(2); // 
      System.out.println(c);
      strBuffer1.setCharAt(1, 'c');
      System.out.println(strBuffer1.toString());
   }
}
