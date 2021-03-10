package ducks;

public class Mallard extends DuckAbstract {
    @Override
    public void fly() {
        System.out.println( "I believe i can fly! And I do" );
    }

    @Override
    public void sing() {
        System.out.println( "show me the way to the next whisky bar");
    }

}
