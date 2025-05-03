package adapter_pattern;

import strategy_pattern.duck_example.Duck;

public class TurkeyAdapter extends Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void display() {
        turkey.display();
    }

    @Override
    public void performFly() {
        turkey.fly();
    }

    @Override
    public void performQuack() {
        turkey.gobble();
    }
}
