package com.lld.stategyDesign.pattern;
interface Walkable{
	void walk();
}
interface Talkable{
	void Talk();
	
}
interface Flyable{
	void Fly();
}
class NormalWalk  implements Walkable{

	@Override
	public void walk() {
		System.out.println("walk in Normal walk");
		
	}
	
}

class NotNormalWalk  implements Walkable{

	@Override
	public void walk() {
		System.out.println("not normal walk in Normal walk");
		
	}
	
}
class NotNormalTalkable implements Talkable{

	@Override
	public void Talk() {
		System.out.println("talk in NotNormalTalkable");
		
	}
	
}
class NormalTalkable implements Talkable{

	@Override
	public void Talk() {
		System.out.println("talk in NormalTalkable");
		
	}
	
}
class NormalFlyable implements Flyable{

	@Override
	public void Fly() {
		System.out.println("Fly in NormalFlyable");
		
	}
}
class NotNormalFlyable implements Flyable{

	@Override
	public void Fly() {
		System.out.println("Fly in NotNormalFlyable");
		
	}
}



abstract class Robot1 {
	protected Walkable walkable;
	protected Talkable talkable;
	protected Flyable flyable;
	
	public Robot1(Walkable w, Talkable t, Flyable f) {
		this.walkable = w;
		this.talkable = t;
		this.flyable = f;
	}
	public void walk() {
		walkable.walk();
	}
	public void Talk() {
		talkable.Talk();
	}
	public void Fly() {
		flyable.Fly();
	}
	public abstract void projection();
}

	class CompanionRobot extends Robot1{

		public CompanionRobot(Walkable w, Talkable t, Flyable f) {
			super(w, t, f);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void projection() {
			// TODO Auto-generated method stub
			System.out.println("Displaying in projection of CompanionRobot");	
		}
	}
	class WorkerRobot extends Robot1{

		public WorkerRobot(Walkable w, Talkable t, Flyable f) {
			super(w, t, f);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void projection() {
			
			System.out.println("Displaying in workerRobot");
			
		}
		
	}
	public class Robot{
		public static void main(String args[]) {
			Robot1 r1 = new CompanionRobot(new  NormalWalk(), new NormalTalkable(), new NormalFlyable());
			r1.Talk();
			r1.walk();
			r1.Fly();
			r1.projection();
			System.out.println("------------");
			}	
	}
