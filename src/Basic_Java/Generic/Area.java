package Basic_Java.Generic;

public class Area<T> {
    T t;

    public Area(T t) {
        this.t = t;
    }

    T getVal(){
        return t;
    }
}