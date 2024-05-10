public class demo6 {
    public static void main(String[] args) {
        Tesla4 obj = (num)->
        {  int mul = 1;
            for(int i = 1; i<=10; i++){
                mul = num * i;
                System.out.println(num + " * " + i + " =   " + mul);
            }

        };
        obj.table(25);
    }
    
}

interface Tesla4{
    void table(int num);
}
