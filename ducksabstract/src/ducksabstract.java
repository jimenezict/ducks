import ducks.Mallard;
import ducks.Rubber;
import ducks.WoodDuck;

public class ducksabstract {

    public static void main(String[] args) {

        Mallard mallard = new Mallard();
        mallard.fly();
        mallard.sing();
        mallard.material();

        WoodDuck woodDuck = new WoodDuck();
        woodDuck.fly();
        woodDuck.sing();
        woodDuck.material();

        Rubber rubber = new Rubber();
        rubber.sing();
        rubber.fly();
        rubber.sing();
    }
}
