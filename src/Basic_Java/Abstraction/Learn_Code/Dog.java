public class Dog extends Mammal{
    String pregnent;
    Dog(String name, String size, String voice,String pregnent) {
        super(name, size, voice);
        this.pregnent = pregnent;
    }
    String className = this.getClass().toString().substring(6);
    @Override
    public void isPregnent() {
        System.out.println(className + " Is Pregnent " + pregnent);
    }

    @Override
    public void makeNoice() {
        System.out.println(className + " Speaks " + voice);
    }

    @Override
    public void animalSize() {
        System.out.println("Size Of " + className + " is " + size);
    }
    
}
