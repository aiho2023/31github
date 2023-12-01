public class Objects{
      
    public static void main(String[] args) {
             
        Person Aika = new Person("Aika");
        System.out.println(Aika.hashCode()); // Person Aika
    }
}
class Person {
     
    public int hashCode(){
 
        return 10 * name.hashCode() + 20456;
    }
}
