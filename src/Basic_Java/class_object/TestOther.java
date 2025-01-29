package Basic_Java.class_object;

public class TestOther {
    private int id;
    private String name;
    private int age;
        
    public TestOther(){
        System.out.println("Object Created !!");
    }

    public TestOther(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public TestOther(TestOther other){
        this.id = other.id;
        this.name = other.name;
        this.age = other.age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void input(int id,String name,int age){
        this.setId(id);
        this.setName(name);
        this.setAge(age);
    }
    public void display(){
        System.out.print(this.getId() + " ");
        System.out.print(this.getName() + " ");
        System.out.print(this.getAge() + " ");
    }
}
