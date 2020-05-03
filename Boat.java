public class Boat extends Vehicule{

    //Constructeur
    public Boat(String brand){
        super(brand);
    }

    // Heritage
    @Override
    public String doStuff(){
        return "Je suis " + getBrand() + " et je fais glou glou!";
    }
}