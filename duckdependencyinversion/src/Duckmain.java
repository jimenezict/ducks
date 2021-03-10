import fly.Fly;
import fly.NoFly;
import sign.NoSing;
import sign.Sing;

public class Duckmain {

    public static void main(String[] args) {

        MallowDuck mallowDuck = new MallowDuck();
        mallowDuck.printDuck();

        Duck duck = new Duck(new Fly(), new Sing());
        duck.printDuck();

        Duck plasticDuck = new Duck(new NoFly(), new NoSing());
        plasticDuck.printDuck();
    }

}
