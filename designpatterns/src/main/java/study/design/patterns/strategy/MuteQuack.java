package study.design.patterns.strategy;

public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("I can't quack..");
    }
}
