package Basic_Java.enums;

public class Enum {
    enum  Week{
        Monday, Tuesday , Wednesday , Thursday;
        /*
        * This Are Enum Constrain
        * it's by Default Public Static and final */
        Week(){
            System.out.println("Constructor " + this);
        }
    }

    public static void main(String[] args) {
        Week w = Week.Monday;

        System.out.println(w.ordinal());//It Will Return The Index Of Constrain
        System.out.println(Week.valueOf("Monday"));//It Will Return The Value Of Argument
        for(Week ele : Week.values()){
            System.out.println(ele);
        }
    }
}
