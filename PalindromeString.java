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
      strBuffer1.insert(3, 'r');
      strBuffer1.append(" E");
      System.out.println(strBuffer1.toString());

      StringBuffer strBuffer3 = new StringBuffer("sEmanueles");
      int startIndex = 1;
      int endIndex = 8;
      char[] buffer3 = new char[endIndex-startIndex];
      strBuffer3.getChars(startIndex, endIndex, buffer3, 0);
      System.out.println(buffer3);

      StringBuffer strBuffer4 = new StringBuffer("Consiste");
      strBuffer4.delete(0,3);
      System.out.println(strBuffer4.toString()); //
         
      strBuffer4.deleteCharAt(4);
      System.out.println(strBuffer4.toString());

      StringBuffer strBuffer5 = new StringBuffer("Aika Babaika!");
      String str1 = strBuffer5.substring(6); // обрезка строки с 6 символа до конца
      System.out.println(str1); //java!
         
      String str2 = strBuffer5.substring(0, 6); // обрезка строки с 0 по 6 символ 
      System.out.println(str2);

      StringBuffer strBuffer6 = new StringBuffer("I'm groot!");
      strBuffer6.replace(4,9,"Aiho");
      System.out.println(strBuffer6.toString()); //hello java!

      
      String Str1 = "Добро пожаловать на ProgLang.su";
      String Str2 = Str1;
      String Str3 = new String("Сайт для изучения программирования");
      String Str4 = new String("ДОБРО ПОЖАЛОВАТЬ НА PROGLANG.SU");
      boolean retVal;

      retVal = Str1.equalsIgnoreCase(Str2);
      System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal );

      retVal = Str1.equalsIgnoreCase(Str3);
      System.out.println("Строка Str1 равна строке Str3? Ответ: " + retVal );
      
      retVal = Str1.equalsIgnoreCase(Str4);
      System.out.println("Строка Str1 равна строке Str4? Ответ: " + retVal );

      StringBuffer strBuffer = new StringBuffer("Tenet");
      buffer.reverse();
      system.out.println(buffer);

   }
}
