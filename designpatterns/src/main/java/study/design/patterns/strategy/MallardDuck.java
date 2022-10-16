package study.design.patterns.strategy;

public class MallardDuck extends Duck{

    MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I'm a real mallard duck..");
    }
}
