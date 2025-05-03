package adapter_pattern;

public class BlackTurkey extends Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble, gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void display() {
        System.out.println("I am black turkey");
    }
}
