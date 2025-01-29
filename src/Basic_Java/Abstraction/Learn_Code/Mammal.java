abstract class Mammal extends Animal{

    public final String isPregnent = null;

    Mammal(String name, String size, String voice) {
        super(name, size, voice);
    }
    
    public abstract void isPregnent();

}
