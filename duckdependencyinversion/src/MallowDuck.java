import fly.Fly;
import fly.IFly;
import sign.ISing;
import sign.Sing;

public class MallowDuck {

    public IFly fly = new Fly();
    public ISing sing = new Sing();

    public void printDuck() {
        System.out.print("Do I fly?");
        fly.flyfunction();
        System.out.print("Do I sign?");
        sing.signfunction();
    }
}
