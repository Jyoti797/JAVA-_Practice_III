import java.util.function.Consumer;
import java.util.*;


public class demo21{
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        // list1.add(11);
        // list1.add(123);
        // list1.add(567);
        // list1.add(757);
        // list1.add(599);
        // System.out.println(list1);

        List <Integer> list2 = Arrays.asList(121,144,169,196,225,256,289);
        // System.out.println(list2);

        // for(Integer i : list2){
        //     System.out.println(i);
        // }

        // Consumer <Integer> cons -> System.out.println(cons);

        list2.forEach(i -> System.out.println(i));




        








    }
}