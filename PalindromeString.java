public class PalindromeString{
   public static void main(String args[]){
      String Str = new String("Добро пожаловать на ProgLang.su");

      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.replaceAll("(.*)Добро пожаловать на ProgLang.su(.*)",
                         "IAMAIHO"));
      
      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.replaceAll("ProgLang.su",
                         "сайт посвященный программированию!"));

       StringBuffer buffer = new StringBuffer("Lalalala");
       buffer.reverse();
       System.out.println(buffer);

      StringBuffer strBuffer = new StringBuffer("Добро пожаловать на ProgLang.su");
      System.out.println(buffer.toString());
   }
}
