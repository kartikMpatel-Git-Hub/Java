package Basic_Java.Thread;

//import Thread;
/*
 * To Use MultiThereading With Runnable Interface We HAve To Inmplement Runnable Interface
 */
//Some Time We Have To Extends Othre Class AT Time We can't Able To Extend Thread Class Beacuse Java Support only One Class+
// Extend At Time SO We Have To Implement Interface
// Basically Thread Class Also Implement Runnable Interface

class AR implements Runnable
{
    public void run()
        {
            for(int i = 0; i < 5; i++)
            {
                System.out.println("Hiii");
                try{
                    Thread.sleep(500);
                }
                catch(Exception e){

                }
            }
        }
}
class BR implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            }
            catch(Exception e){

                }
            }
        }
}

public class ThreadUsingRunnable {
    public static void main(String[] args) {
        AR ob1 = new AR();
        BR ob2 = new BR();
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        t1.start();
        t2.start();
    }
}