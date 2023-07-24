package polimorphisme;
public class AeroPlan extends Vehicle {
   @Override
   public void walk(){ //override
        System.out.println("Aeroplan Flying");
   }
   @Override
        public void fly(){ //override
        System.out.println("Aeroplan Terbang");
    }
    public static void main(String[] args) {
      
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
        garuda.fly();
    }
}
      
    

