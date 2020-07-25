import java.util.ArrayList;
import java.util.Arrays;

class PrimeDirective {

    // isPrime checks a number to determine if it's 2 or < 2
    public boolean isPrime(int number){

        if (number == 2){
            return true;
        }else if (number < 2){
            return false;
        }

        for(int i = 2; i < number; i++){

            if (number % i == 0){
                return false;
            }

        }
        return true;
    }
    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers){
            if (isPrime(number)){
                primes.add(number);
            }
        }
        return primes;

    }

    public ArrayList<Integer> isEven(int[] numbers){

        ArrayList<Integer> evens = new ArrayList<Integer>();
        for (int number : numbers){
            if(number % 2 == 0){
                evens.add(number);
            }
        }
        return evens;
    }

    public ArrayList<Integer> isOdd(int[] numbers){
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int number : numbers){
            if(number % 2 != 0){
                odds.add(number);
            }
        }
        return odds;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(Arrays.toString(numbers));
        System.out.println(pd.onlyPrimes(numbers));
        System.out.println(pd.isEven(numbers));
        System.out.println(pd.isOdd(numbers));
    }

}