// Strategy Interface for Walk
package com.robot.bug.Check;
interface WalkableRobot {
    void walk();
}

// Concrete Walk Strategies
class NormalWalk implements WalkableRobot {

    @Override
    public void walk() {
        System.out.println("Walking normally...");
    }
}

class NoWalk implements WalkableRobot {

    @Override
    public void walk() {
        System.out.println("Cannot walk.");
    }
}


// Strategy Interface for Talk
interface TalkableRobot {
    void talk();
}

// Concrete Talk Strategies
class NormalTalk implements TalkableRobot {

    @Override
    public void talk() {
        System.out.println("Talking normally...");
    }
}

class NoTalk implements TalkableRobot {

    @Override
    public void talk() {
        System.out.println("Cannot talk.");
    }
}


// Strategy Interface for Fly
interface FlyableRobot {
    void fly();
}

// Concrete Fly Strategies
class NormalFly implements FlyableRobot {

    @Override
    public void fly() {
        System.out.println("Flying normally...");
    }
}

class NoFly implements FlyableRobot {

    @Override
    public void fly() {
        System.out.println("Cannot fly.");
    }
}


// Abstract Robot Class
abstract class Robot {

    protected WalkableRobot walkBehavior;
    protected TalkableRobot talkBehavior;
    protected FlyableRobot flyBehavior;

    public Robot(
            WalkableRobot walkBehavior,
            TalkableRobot talkBehavior,
            FlyableRobot flyBehavior) {

        this.walkBehavior = walkBehavior;
        this.talkBehavior = talkBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void walk() {
        walkBehavior.walk();
    }

    public void talk() {
        talkBehavior.talk();
    }

    public void fly() {
        flyBehavior.fly();
    }

    public abstract void projection();
}


// Concrete Robot: Companion
class CompanionRobot extends Robot {

    public CompanionRobot(
            WalkableRobot walkBehavior,
            TalkableRobot talkBehavior,
            FlyableRobot flyBehavior) {

        super(walkBehavior, talkBehavior, flyBehavior);
    }

    @Override
    public void projection() {
        System.out.println("Displaying friendly companion features...");
    }
}


// Concrete Robot: Worker
class WorkerRobot extends Robot {

    public WorkerRobot(
            WalkableRobot walkBehavior,
            TalkableRobot talkBehavior,
            FlyableRobot flyBehavior) {

        super(walkBehavior, talkBehavior, flyBehavior);
    }

    @Override
    public void projection() {
        System.out.println("Displaying worker efficiency stats...");
    }
}


// Main Class
public class StrategyDesignPattern1 {

    public static void main(String[] args) {

        // Companion Robot
        Robot robot1 = new CompanionRobot(
                new NormalWalk(),
                new NormalTalk(),
                new NoFly()
        );

        robot1.walk();
        robot1.talk();
        robot1.fly();
        robot1.projection();

        System.out.println("--------------------");

        // Worker Robot
        Robot robot2 = new WorkerRobot(
                new NoWalk(),
                new NoTalk(),
                new NormalFly()
        );

        robot2.walk();
        robot2.talk();
        robot2.fly();
        robot2.projection();
    }
}