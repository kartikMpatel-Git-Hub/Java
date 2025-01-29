package Basic_Java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);

        // nums.forEach(n -> System.out.println(n));

        //Let's See How It Work Internally 
        //forEach Funtion Internally Takes Object Of consumer Interface And To Declare It Object There Is Syntex

        // Consumer<Integer> c = new Consumer<>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // }; 

        //SO We Declare Like This

        // Consumer<Integer> cons = n -> System.out.println(n);
        //SO this Is a Interface So Can We Not Say That We Declare This Like This 
        // And Call forEach With cons Object 
        // nums.forEach(cons);
        // And cons Have What ?
        // Which Is Syntext Of cons !! Right 

        nums.forEach(n -> System.out.println(n));
        

    }
}
