enum Week1{
    MON,TUE,WED,THU,FRI,SAT,SUN
}
enum Result1{
    excellent,
    average,
    firstDivison, 
    secondDivison,
    thirdDivison,
    FAIL,
    NR

}

public class demo18{
    public static void main(String[] args) {
        // Week w = Week.THU;
        // System.out.println(w);
        // int index = Week.FRI.ordinal();
        // System.out.println(index);

        Week1 [] saptah = Week1.values();
        for(Week1 w : saptah){
            System.out.println(w + ":" + w.ordinal());
        }

    }

}
