package Basic_Java.Thread;

public class ThreadUsingRunnableLamda {
    public static void main(String[] args) {
        Runnable R1 = () -> {
            for(int i = 0; i < 5; i++)
            {
                System.out.println("Hi");
                try{Thread.sleep(500);}
                catch(Exception e){}
                }
            };
            Runnable R2 = () -> {
                for(int i = 0; i < 5; i++)
                {
                    System.out.println("Hello");
                    try{Thread.sleep(500);}
                    catch(Exception e){}
                }
            };

            Thread t1 = new Thread(R1);
            Thread t2 = new Thread(R2);
            t1.start();
            t2.start();  
    }
    
}
