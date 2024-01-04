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

      StringBuffer strBuffer1 = new StringBuffer("Maron");
      char c = strBuffer1.charAt(2); // 
      System.out.println(c); // r
      strBuffer1.setCharAt(2, 'c');
      strBuffer1.setCharAt(3, 'r');
      strBuffer1.setCharAt(4, 'o');
      strBuffer1.append("n");
      System.out.println(strBuffer1.toString());

      int startIndex = 1;
      int endIndex = 4;
      char[] buffer = new char[endIndex-startIndex];
      strBuffer1.getChars(startIndex, endIndex, buffer, 0);
      System.out.println(buffer);
   }
}
