
@FunctionalInterface
interface Tesla8{
    void disp();
}
class Plane{
    public void planeFliesAtGoodHeight(){
        System.out.println("Plane is flying...");
    }
}

class CargoPlane extends Plane{
    @Override
    public void planeFliesAtGoodHeight(){
        System.out.println("Cargo plane flies low");
    }
}
public class demo14{
    public static void main(String[] args) {
        Plane airbusc295 = new CargoPlane();
        airbusc295.planeFliesAtGoodHeight();

    }
}
