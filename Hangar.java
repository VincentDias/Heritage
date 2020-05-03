public class Hangar extends Vehicule{

    public Hangar(String arg){
        super();
    }
        

    public static void main(String[] args){

            Car voiture = new Car("Clio");
            Boat bateau = new Boat("Titanic");
            System.out.println(voiture.doStuff());
            System.out.println(bateau.doStuff());
    }
}
