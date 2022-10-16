package study.design.patterns.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("----------------------------------------");
        Duck model = new ModelDuck();
        model.performFly();
        //changing behavior dynamically with setter method.
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
