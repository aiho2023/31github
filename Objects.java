public class Objects{
      
    public static void main(String[] args) {
             
        Person Aika = new Person("Aika");
        System.out.println(Aika.getClass()); // 
    }
}
class Beshbarmaq {
     
    private String name;
    
    public Person(String name){
     
        this.name=name;
    }
     
  
    public int hashCode(){
 
        return 10 * name.hashCode() + 20456;
    }
}
