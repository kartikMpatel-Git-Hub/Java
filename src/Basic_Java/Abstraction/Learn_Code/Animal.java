abstract class Animal{
    String name;
    String size;
    String voice;

    Animal(String name,String size,String voice){
        this.name = name;
        this.size = size;
        this.voice = voice;
    }
    public abstract void makeNoice();
    public abstract void animalSize();
}