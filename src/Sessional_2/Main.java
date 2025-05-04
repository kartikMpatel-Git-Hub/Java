package Sessional_2;

import jdk.nio.mapmode.ExtendedMapMode;

import java.util.Objects;

class OldCar{
    protected int n;
//    class
//    OldCar(){
//
//    }
//    OldCar(int n){
//        this.n = n;
//    }

    int getN(){
        return n;
    }
}
class Car extends OldCar{
    String modelName;
    String color;
    int price;
    public Car(String modelName, String color, int price) {
        this.modelName = modelName;
        this.color = color;
        this.price = price;
        super.n = 10;
    }

    @Override
    public boolean equals(Object o) {
        Car c = (Car) o;
        return this.price == c.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, color, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", price = " + price +
                '}';
    }

    void getSuperData(){
        System.out.println(super.getN());
    }
}
public class Main{
    public static void main(String[] args) {
        Car ob1 = new Car("Car1","Red",100);
        Car ob2= new Car("Car1","Red",100);
        System.out.println(ob1);

        System.out.println(ob1.equals(ob2));
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
        System.out.println(ob1);
//        Employee e = new Employee("kartik",1000,10);
//        e.calBudget();
//
//        TeamLead t = new TeamLead("P1",10,1,100);
//        t.calBudget();

//        Employee up = new TeamLead("P2",10,1,200);
//        up.calBudget();
//
//        Employee down = new Employee("Kartik",1000,10);
//        TeamLead downLeed = (TeamLead) up;
//        downLeed.calBudget();
    }
}
