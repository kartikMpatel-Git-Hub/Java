package Thread;
/*
 * To Use MultiThereading We Need To Extend Thread Class
 */
class A extends Thread
{
    /*
         * It Simple Extends Therad Class Which Hase run Method To Start Thread
         */
        public void run()
        {
            for(int i = 0; i < 5; i++)
            {
                System.out.println("Hiii");
                try{
                    sleep(500);
                }
                catch(Exception e){
                    
                }
            }
        }
}
class B extends Thread
{
    public void run()// To Run Any Thing We Need To Write It On Run Funtion
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Hello");
            try{
                sleep(500);
                // It Will Stop Execution for 500 Milisecond 
                // To Use Sleep We Have to Put It Into TRY AND CATCH Block To Handle It 
            }
            catch(Exception e){

            }
        }
    }
}
public class ThreadClass {

    public static void main(String[] args) {
        // A obj1 = new A();
        // B obj2 = new B();
        /*
         * It Simple Exexute Line By Line 
         * And Wait Untill First Method End
         */

        // obj1.show();
        // obj2.show();
        /*
         * let's Create There obj1
         */
        A obj1 = new A();
        B obj2 = new B();
        /*
         * To Start The Thread We Have To Call FUntion Start
         */

        System.out.println(obj1.getPriority());
        // It Will Show Priority Of Object Thread 
        // There Is 10 Priorite 1 to 10
        /*
         * 1.Max
         * 5.Normal
         * 10.min
         * 
         * Additionally 
         * 
         * Thread.MAX_PRIORITY
         * Thread.MIN_PRIORITY
         */
        obj1.start();
        obj2.start();
    }
}