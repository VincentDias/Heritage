public abstract class Vehicule{

    // Attributs
    private String brand;
    private int kilometers;

    // Constructeur
    public Vehicule(String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public Vehicule(String brand){
        this.brand = brand;
        this.kilometers = 0;
    }

    // Getter et Setter
    public String getBrand(){
        return this.brand;
    }

    public int getKilometers(){
        return this.kilometers;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setKilometers(int kilometers){
        this.kilometers = kilometers;
    }

    //Méthode abstraite
    public abstract String doStuff();
}
