package Sessional_2;

interface Ticket {
    default void testing(){
        System.out.println("Testing");
    }

    static void testing1(){
        System.out.println("Testing 1");
    }

    void  bookTicket();
}

class Movie implements Ticket {
    @Override
    public void bookTicket() {
        System.out.println("Movie");
    }

    void testing1(){
        System.out.println("Testing 2");
    }
}

class Train implements Ticket{

    @Override
    public void bookTicket() {
        System.out.println("Train");
    }
}

public class Booking {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.bookTicket();

        Train t1 = new Train();
        t1.bookTicket();
    }
}

