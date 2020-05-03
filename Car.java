public class Car extends Vehicule{

    // Constructeur
    public Car(String brand){
        super(brand);
    }

    // Heritage
    @Override
    public String doStuff(){
        return "Je suis " + getBrand() + " et je fais vroum vroum!";
    }
}