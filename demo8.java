public class demo8 {
    public static void main(String[] args) {
        Tesla6 obj = (range) ->
        { int sum = 0;
            for(int i = 1; i<= range; i++){
                if(i%2==0){
                    sum = sum + i;
                }
            }
            System.out.println("Sum of all even numbers till " + range + " is " + sum);
         
        };

        obj.sumOfEven(100);

        
    }
}

interface Tesla6{
    void sumOfEven(int range);
}
