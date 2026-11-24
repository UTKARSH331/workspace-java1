package com.lld.stategyDesign.practice.pattern;

//--- Strategy Interface for Walk ---
interface WalkableRobot {
 void walk();
}

//--- Concrete Strategies for walk ---
class NormalWalk implements WalkableRobot {
 public void walk() {
     System.out.println("Walking normally...");
 }
}

class NoWalk implements WalkableRobot {
 public void walk() {
     System.out.println("Cannot walk.");
 }
}

//--- Strategy Interface for Talk ---
interface TalkableRobot {
 void talk();
}

//--- Concrete Strategies for Talk ---
class NormalTalk implements TalkableRobot {
 public void talk() {
     System.out.println("Talking normally...");
 }
}

class NoTalk implements TalkableRobot {
 public void talk() {
     System.out.println("Cannot talk.");
 }
}

//--- Strategy Interface for Fly ---
interface FlyableRobot {
 void fly();
}

class NormalFly implements FlyableRobot {
 public void fly() {
     System.out.println("Flying normally...");
 }
}

class NoFly implements FlyableRobot {
 public void fly() {
     System.out.println("Cannot fly.");
 }
}

//--- Robot Base Class ---
abstract class Robot {
 protected WalkableRobot walkBehavior;
 protected TalkableRobot talkBehavior;
 protected FlyableRobot flyBehavior;

 public Robot(WalkableRobot w, TalkableRobot t, FlyableRobot f) {
     this.walkBehavior = w;
     this.talkBehavior = t;
     this.flyBehavior = f;
 }

 public void walk1() {
     walkBehavior.walk();
 }

 public void talk1() {
     talkBehavior.talk();
 }

 public void fly1() {
     flyBehavior.fly();
 }

 public abstract void projection(); // Abstract method for subclasses
}

//--- Concrete Robot Types ---
class CompanionRobot extends Robot {

 public CompanionRobot(WalkableRobot w, TalkableRobot t, FlyableRobot f) {
		super(w, t, f);
		// TODO Auto-generated constructor stub
	}

public void projection() {
     System.out.println("Displaying friendly companion features...");
 }
}

class WorkerRobot extends Robot {
 public WorkerRobot(WalkableRobot w, TalkableRobot t, FlyableRobot f) {
     super(w, t, f);
 }

 public void projection() {
     System.out.println("Displaying worker efficiency stats...");
 }
}

//--- Main Function ---
public class Driver {
 public static void main(String[] args) {
     Robot robot1 = new CompanionRobot(new NormalWalk(), new NormalTalk(), new NoFly());
     robot1.walk1();
     robot1.talk1();
     robot1.fly1();
     robot1.projection();
     

     System.out.println("--------------------");

     Robot robot2 = new WorkerRobot(new NoWalk(), new NoTalk(), new NormalFly());
     robot2.walk1();
     robot2.talk1();
     robot2.fly1();
     robot2.projection();
 }
}