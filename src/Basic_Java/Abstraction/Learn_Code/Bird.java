public class Bird extends Animal{

    Bird(String name, String size, String voice) {
        super(name, size, voice);
    }
    String className = this.getClass().toString().substring(6);

    @Override
    public void makeNoice() {
        System.out.println(className + " Is " + voice);
    }

    @Override
    public void animalSize() {
        System.out.println("Size Of " + className + " is " + size);
    }
    
}
