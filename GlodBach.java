package method;

public class GlodBach {
    public static void main(String[] args){
        int limit = 10000;
        checkGold(limit);
    }

    public static boolean isCounterExample(int num){
        for (int i = 2; i <= num/2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num){
        for(int i = 2; i * i <= num ; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void checkGold(int limit){
        for(int i = 4; i <= limit; i += 2){
            if(isCounterExample(i)){
                System.out.println("congraulation");
                break;
            }else{
                System.out.println(i+" is not a counter example");
            }
        }
    }
}
