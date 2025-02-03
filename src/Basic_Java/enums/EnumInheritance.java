package Basic_Java.enums;
interface Test{
    void greet();
}

class Test1{
    void greet(){
        System.out.println("Class Greet");
    }
}
public class EnumInheritance {
    enum TestEnum implements Test{
        /// We Can implement The Interface In Enum
        Monday , Tuesday , Wednesday;

        TestEnum() {
            System.out.println("Constructor " + this);
        }

        @Override
        public void greet() {
            System.out.println("Greet !");
        }
    }

//    enum TestEnum extends Test1{
//        //        /// We Can implement The Interface In Enum
//        Monday , Tuesday , Wednesday;
//    }
    /// We Can't Extend The Class In ENUM
    public static void main(String[] args) {
        TestEnum t = TestEnum.Monday;
        t.greet();
    }

}
