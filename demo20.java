enum Result3 {
    PASS, FAIL, NR;
}

public class demo20 {
    public static void main(String[] args) {
        Result3 parikshya = Result3.FAIL;
        switch (parikshya) {
            case PASS:
                System.out.println("Congrats !!! ");
                System.out.println("You have passed the exam with flying colours");
                break;
            case FAIL:
                System.out.println("OOPS !!! ");
                System.out.println("You have failed in the exam");
                System.out.println("Plzz  Reappear for the exam");
                break;
            case NR:
                System.out.println("Sorry !!! ");
                System.out.println("Something went wrong");
                break;
        }
    }
}
