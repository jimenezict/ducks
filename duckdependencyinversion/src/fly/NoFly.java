package fly;

public class NoFly implements IFly {
    @Override
    public void flyfunction() {
        System.out.println("I don't fly!");
    }
}
