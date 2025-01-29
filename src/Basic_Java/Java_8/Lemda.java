package Basic_Java;

interface A {
    void show();  // So We can't Define Body In Interface 
    // Either We Have TO Define On Child Class Or In Calling   
}
interface B{
    void argu(int a);  // So We can't Define Body In Interface 
    // Either We Have TO Define On Child Class Or In Calling   
}

interface C{
    int argu(int a,int b);  // So We can't Define Body In Interface 
    // Either We Have TO Define On Child Class Or In Calling   
}
public class Lemda {
    
    public static void main(String[] args) {
        // A obj = new A() {//So We Have To Decare Show Funtion Here 
        //     public void show(){
        //         System.out.println("Hello");
        //     }
        // };
        //So That's Long Method 

        A obj = () -> System.out.println("Hello");//So We Can Define Funtion With That One Line 
        // We Need To Define Breakets If We Have Multiple Line

        // What If We Have Argument Value 
        // B obj = new B() {//So We Have To Decare Show Funtion Here 
        //     public void argu(int a){
        //         System.out.println(a);
        //     }
        // };
        // B objB = (int a) -> System.out.println(a); 
        // B objB = (a) -> System.out.println(a); 
        B objB = a -> System.out.println(a); //That's Code After All Reduced

        // What If We Have Argument And Also Return Value 
        // C obj = new C() {//So We Have To Decare Show Funtion Here 
        //     public void argu(int a,int b){
        //         return a + b;
        //     }
        // };
        // B objB = (int a,int b) -> a + b; 
        C objC = (a,b) -> a+b; //That's Code After All Reduced

        obj.show();
        objB.argu(1);
        objC.argu(1, 2);
    }
}
