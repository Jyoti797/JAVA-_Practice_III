public class demo9 {
    public static void main(String[] args) {
        Tesla7 obj = (count) -> {
            int prev = 0;
            int present = 1;
            int sum = 0;
            System.out.println(prev);
            System.out.println(present);
            for (int i = 2; i < count; i++) {
                sum = prev + present;
                System.out.println(sum);
                prev = present;
                present = sum;
            }
        };

        obj.fibbo(15);

    }
}

interface Tesla7 {
    void fibbo(int count);
}
