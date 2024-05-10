

public class demo1 {
    public static void main(String[] args) {
        for(int range = 2; range<=100; range++){
            if(isPrime(range)){
                System.out.println(range);
            }
        }
    }
    static boolean isPrime(int num){
        int count = 0;
        for(int i = 2; i<num; i++){
            if(num%i==0){
                count = count + 1;
            }
        }
        if(count==0){
            return true;
        }
        else{
            return false;
        }
    }

}


