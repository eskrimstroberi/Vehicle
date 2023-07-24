package polimorphisme;
public class Helikopter  extends Vehicle {
   public void walk(){ //override
        System.out.println("Helicopter Flying");
   }
        public void fly(){ //override
        System.out.println("Helikopter Terbang ");
    }
    public static void main(String[] args) {
      
        Helikopter SusiAir = new Helikopter();
        SusiAir.function();
        SusiAir.fuel();
        SusiAir.walk();
        SusiAir.fly();
    }  
}
