public class Objects{
      
    public static void main(String[] args) {
             
        Beshbarmaq Aika = new Beshbarmaq("Aika");
        System.out.println(Aika.getClass()); // 
    }
}
class Beshbarmaq {
     
    private String name;
    
    public Beshbarmaq(String name){
     
        this.name=name;
    }
     
  
    public int hashCode(){
 
        return 10 * name.hashCode() + 20456;
    }
}
