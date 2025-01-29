package Basic_Java.introduction;

/// here we can't create class with static
//static class Test{
//    int id;
//
//    public Test(int id) {
//        this.id = id;
//    }
//
//}
class Test1{
    int id;

    public Test1(int id) {
        this.id = id;
    }

}
public class Static1 {
//    class Test{ Can't Create Class Inside Class Because It Need Instance(Object) Of Upper CLass
//        int id;
//
//        public Test(int id) {
//            this.id = id;
//        }
//
//    }
//    Instead We Use Static To Use It
    static class Test{
        int id;
        static String name;

    public Test(int id,String name) {
        this.id = id;
        Test.name = name;
    }

    @Override
    public String toString() {
        return id + "\n" + name;
    }
}
    public static void main(String[] args) {
        Test t1 = new Test(1,"Kartik");
        Test t2 = new Test(2,"Manav");
        System.out.println(t1);
        System.out.println(t2);

        /// Outer Object
//        Test1 t = new Test1(10);
//        System.out.println(t.id);
    }
}
