package DSA.Basic;

public class FastExponatial {

    public static int pow(int num,int power){
        int res = 1;
        while (power > 0){
            if(power % 2 != 0){
                res *= num;
            }
            power /= 2;
            num *= num;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(pow(2,10));
    }
}
