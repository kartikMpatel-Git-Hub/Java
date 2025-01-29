package Basic_Java.singleTon;

public class SingleTon {
    private SingleTon(){
        System.out.println("Object Created !");
    }

    private static SingleTon obj;
    public static SingleTon createObject(){
        if(obj == null){
            obj = new SingleTon();
        }
        System.out.println("Object Returned !");
        return obj;
    }
}

