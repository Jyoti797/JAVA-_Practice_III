

interface Tesla1{
        boolean isEven(int num);
    }

public class demo2{
   
    public static void main(String[] args) {
        Tesla1 obj = (num) ->{
            if(num%2==0)
                 return true;
            else
                 return false;
        };
        if (obj.isEven(18)){
             System.out.println("This is an Even number");
        }else{
            System.out.println("This is an Odd number");
        }



    }
}