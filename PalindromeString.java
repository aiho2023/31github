public class PalindromeString{
   public static void main(String args[]){
      String Str = new String("Добро пожаловать на ProgLang.su");

      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.replaceAll("(.*)ProgLang(.*)",
                         "IAMGROOT"));
      
      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.replaceAll("ProgLang.su",
                         "сайт посвященный программированию!"));
   }
}
