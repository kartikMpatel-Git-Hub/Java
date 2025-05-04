package Sessional_2;

class Outer{
    int outer = 10;
    Inner i;
    Outer(){
        i = new Inner();
    }
    class Inner{
        int inner = 20;
        void display(){
//            System.out.println("Outer : "+outer);
            System.out.println("Inner : "+inner);
        }
    }
    void display(){
//        System.out.println("Inner : "+i.inner);
        System.out.println("Outer : "+outer);
    }
}


public class InnerOuter {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner newI = o.new Inner();
        o.display();
        o.i.display();
    }
}
