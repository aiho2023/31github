public class Objects{
      
    public static void main(String[] args) {
             
        Person Aika = new Person("Aika");
        System.out.println(Aika.toString()); // Person Aika
    }
}
class Person {
     
    private String name;
     
    public Person(String name){
     
        this.name=name;
    }
}
