public class demo3 {
    public static void main(String[] args) {
        Tesla2 obj = (num) ->
        {
            int count = 0;
            for(int i = 2; i<num; i++){
                if(num%i==0)
                    count = count + 1;
            }
            if(count==0)
                return true;
            else
                return false;
        };
        for(int range = 2; range <=100; range++){
            if(obj.isPrime(range)){
                System.out.println(range);
            }
        }
    }
    
}
interface Tesla2{
    boolean isPrime(int num);
}

//WAP to find prime numbers between 1 to 100