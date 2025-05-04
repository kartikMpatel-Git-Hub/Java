package Sessional_2;

interface testt {
    int n = 10;
    void test1();
    void tets2();
}
abstract class Abstra{
    int n;
    Abstra(){

    }
    Abstra(int n){
        System.out.println("Class 1");
        this.n = n;
    }
    abstract void test();
}
abstract  class extended extends Abstra{

    int n1;
    extended(){
        super();
    }
    extended(int n1,int n){
        super(n);
        System.out.println("Class 2");
        this.n1 = n1;
    }
}

class testt1 extends extended{

    testt1(int n1,int n){
        super(n1,n);
        System.out.println("CLass 3");
    }
    @Override
    void test() {
        System.out.println("Helo");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        testt1 t = new testt1(1,10);

    }
}
