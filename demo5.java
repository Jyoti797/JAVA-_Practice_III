public class demo5 {
    public static void main(String[] args) {
        Tesla3 obj = (num)->
        { int fact = 1;
            for(int i = 1; i<=num; i++){
                fact = fact * i;
            }
            return fact;
        };

        int result = obj.fact(7);
        System.out.println(result);

    
  }
}
interface Tesla3{
    int fact(int num);
}