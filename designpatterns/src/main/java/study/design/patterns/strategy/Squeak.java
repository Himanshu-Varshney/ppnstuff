package study.design.patterns.strategy;

public class Squeak implements QuackBehavior{
    public void quack() {
        System.out.println("Queak...");
    }
}
