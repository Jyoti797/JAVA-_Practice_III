public class demo7 {
    public static void main(String[] args) {
        Tesla5 obj = (int range) ->
        { int sum = 0;
            for(int i = 1; i<= range; i++){
                if(i%2!=0){
                    sum = sum + i;
                }
            }
            System.out.println("Sum of all odd numvers till " + range + " is " + sum);

        };
        obj.sumOfOdd(100);
    }
    
}
interface Tesla5{
    void sumOfOdd(int range);
}
