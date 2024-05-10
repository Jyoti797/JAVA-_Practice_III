public class demo4 {
    public static void main(String[] args) {

        for(int range = 100; range <= 5000; range++){
            if(isArmstrong(range)){
                System.out.println(range);
            }
        }
        
    }
    static boolean isArmstrong(int num){
        int basket = num;
        int temp = num;
        int rem;
        int sum = 0;
        String x = String.valueOf(temp);
        int digits = x.length();
        while(basket!=0){
           rem = basket % 10;
           sum = sum + (int) Math.pow(rem, digits);
           basket = basket/10;
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
    
}
//WAP to find armstrong number till 5000

