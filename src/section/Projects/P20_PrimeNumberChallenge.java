package section.Projects;

public class P20_PrimeNumberChallenge {
    public static void main(String[] args) {
     checkPrime(3);
    }
    public static void checkPrime(int primeNumber){
        int count = 0;
        for(int i = 1; i<=primeNumber;i++) {
        if(primeNumber%i==0){
            count++;
        }
        }
        if(count==2){
            System.out.println("Prime Number!");
        }else{
            System.out.println("Not a Prime Number!");
        }
        }
    }

