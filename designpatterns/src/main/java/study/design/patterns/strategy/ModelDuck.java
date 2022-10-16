package study.design.patterns.strategy;

public class ModelDuck extends Duck{

    ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }
    public void display() {
        System.out.println("I'm a model duck");
    }

}
