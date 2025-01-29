package Basic_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

//Here We Simple Find Sum Of All Even Number After Double It 
public class Stream_Example {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);
        
        
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);// It Will Filter And Store All Even Number IN S2
        // Stream<Integer> s3 = s2.map(n -> n * 2);// It Will Multiple All N Value With 2 And Store It
        // int ans = s2.reduce(0,(f,s) -> f + s); // It Will Sum All All Value And return Single Value AS Sum Of All 
    
        int ans = nums.stream()
        .filter(n -> n % 2 == 0)//It Takes Parameter As Predicate Which Have Funtion 
        /*   
        Test Which Returns A Boolean Value 
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n){
                if(n % 2 == 0)
                    return true;
                else
                    return false;
            }
        };

        So Can We Not Write In Single Line Beacuse It Is Interface With Lamda
        redicate<Integer> p = n -> n%2 == 0;
        
        n -> n%2 == 0;
        It is Same As We Passing Filter 
        */
        .map(n -> n * 2)
        /*
            *Function<Integer,Integer> F = new Function<Integer,Integer>() {
                public Integer apply(Integer n) {
                    return n * 2;
                }
            }; 
            //It Is Also A Interface So You Make It Lamda 
            Funtion<Integer,Integer> F = n -> n * 2;
             F = n -> n * 2;
            It is Same As We Passing Map 
         */
        .reduce(0,(f,s) -> f + s);
        // Here We Have reduce Funtion Which Return  
        //It Will Work Same AS Above But In Sigle line

        System.out.println(ans);
        
    }
}
