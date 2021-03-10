import fly.IFly;
import sign.ISing;

public class Duck {

    private IFly fly;
    private ISing sing;

    public Duck(IFly fly, ISing sing) {
        this.fly = fly;
        this.sing = sing;
    }

    public void printDuck() {
        System.out.print("Do I fly?");
        fly.flyfunction();
        System.out.print("Do I sign?");
        sing.signfunction();
    }
}
