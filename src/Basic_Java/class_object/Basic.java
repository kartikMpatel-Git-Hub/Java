package Basic_Java.class_object;

//class Test{
//    private int num;
//    private String name;
//
//    Test(){
//        System.out.println("Object Created !");
//    }
//    public Test(int num, String name) {
//        this.num = num;
//        this.name = name;
//    }
//
//    public int getNum() {
//        return num;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}

public class Basic {
    public static void main(String[] args) {
        TestOther T = new TestOther();
        T.input(1,"Kartik",20);
        TestOther copy = new TestOther(T);
        T.display();
        System.out.println();
        copy.setAge(21);
        copy.display();
//        Test t1 = new Test();
//        Test t2 = new Test();
//        t1.setNum(1);
//        t1.setName("Kartik");
//        System.out.println(t1.getNum());
//        System.out.println(t1.getName());
//        System.out.println(t2.getNum());
//        System.out.println(t2.getName());
    }

}
