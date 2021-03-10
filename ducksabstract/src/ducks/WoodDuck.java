package ducks;

public class WoodDuck extends DuckAbstract {

    @Override
    public void fly() {
        System.out.println("I am a plane");
    }

    @Override
    public void sing() {
        System.out.println( "knock knock knocking on heaven doors");
    }

}
