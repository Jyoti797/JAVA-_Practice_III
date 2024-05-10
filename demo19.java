enum Result2{
    PASS,FAIL,NR;


    int marks;
    Result2(){
        System.out.println("Constructor in ENUM");
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class demo19{
    public static void main(String[] args) {
        Result2.PASS.setMarks(50);
        int m = Result2.PASS.getMarks();
        System.out.println(m);

        Result2.FAIL.setMarks(32);
        int x = Result2.FAIL.getMarks();
        System.out.println(x);

        Result2.NR.setMarks(9);
        int y = Result2.NR.getMarks();
        System.out.println(y);

    }
}
