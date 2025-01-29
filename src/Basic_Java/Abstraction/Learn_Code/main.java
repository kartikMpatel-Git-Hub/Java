import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("German Shaperd", "To Big","Modi Ne Yeh Kar Diya","Yes"));
        animals.add(new Bird("Sparow", "To Small","Chii CHii"));

        for(Animal i:animals){
            animalsBehaviour(i);
            if(i instanceof Mammal currMammal)
                currMammal.isPregnent();
        }
    }

    public static void animalsBehaviour(Animal type){
        type.animalSize();
        type.makeNoice();
    }
}
