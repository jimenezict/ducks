package sati;

public class Mallard implements IDuck {
    @Override
    public String fly() {
        return "I believe i can fly! And I do";
    }

    @Override
    public String sing() {
        return "show me the way to the next whisky bar";
    }

}
