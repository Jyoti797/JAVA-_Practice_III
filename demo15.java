import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{
    String country() default "India";
    String iplTeam() default "Royal Challengers Banglore";

}

@CricketPlayer
class Virat{
    @CricketPlayer
    private String wife;
    private int jersyNum;

    @CricketPlayer
    public String getWife() {
        return wife;
    }
    public void setWife(String wife) {
        this.wife = wife;
    }
    public int getJersyNum() {
        return jersyNum;
    }
    public void setJersyNum(int jersyNum) {
        this.jersyNum = jersyNum;
    }
}

public class demo15{
    public static void main(String[] args) {
        Virat v = new Virat();
        v.setWife("ANUSHKA SHARMA");
        v.setJersyNum(18);

        // System.out.println(v.getWife());
        // System.out.println(v.getJersyNum());
        Class c = v.getClass();
        Annotation a = c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer) a;
        String team1 = cp.country();
        System.out.println(team1);
        String team2 = cp.iplTeam();
        System.out.println(team2);


        
    }
}