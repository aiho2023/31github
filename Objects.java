public class Objects{
      
    public static void main(String[] args) {
             
        Person tom = new Person("Aika");
        System.out.println(tom.toString()); // Person Tom
    }
}
class Person {
     
    private String name;
    
    public Person(String name){
     
        this.name=name;
    }
     
    public String toString(){
          
        return "Person " + name;
    }
}
