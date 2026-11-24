package com.command.practice.design.pattern;

interface ICommand{
	void execute();
	void undo();
}

class Light{
	public void on() {
		System.out.println("light is on");
	}
	public void off() {
		System.out.println("light is off");
	}
}

class LightCommand implements ICommand{
Light l1;
	@Override
	
	
	public void execute() {
		l1.on();
		
	}

	public LightCommand(Light l1) {
		super();
		this.l1 = l1;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		l1.off();
	}
	
}
class Fan{
	public void on() {
		System.out.println("fan is on ");
	}
	public void off() {
		System.out.println("fan is off");
	}
	
}
class FanCommand implements ICommand{
private Fan f;

	public FanCommand(Fan f) {
	super();
	this.f = f;
}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		f.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		f.off();
	}
	
}

class RemoteController {
	public static final int numsButtons = 2;
	private ICommand []cmd;
	private boolean pressButtons[];
	public RemoteController() {
		super();
		this.cmd = new ICommand[numsButtons];
		this.pressButtons = new boolean[numsButtons];
		for(int i =0; i<2; i++) {
			cmd[i] = null;
			pressButtons[i] = false;
		}		
	}
	public void setCommand(int idx, ICommand I1itmeansacommandname) {
		if(idx >=0 && idx<=(numsButtons)) {
			cmd[idx] = I1itmeansacommandname;
			pressButtons[idx] = true;
		}
	}
	public void yahaparbuttonpresskiyajatah(int idx) {
		if(idx >= 0 && idx <2 && cmd[idx] != null) {
			if(pressButtons[idx] == false) {
				cmd[idx].execute();
				pressButtons[idx] = true;
			} else {
				cmd[idx].undo();
				pressButtons[idx] = false;
			}			
		}
	}
	
}
public class Driver5 {
	public static void main(String[] args) {
		Light l1 = new Light();
		Fan f11 = new Fan();
		LightCommand l22 = new LightCommand(l1);
		FanCommand fancommand = new FanCommand(f11);

      RemoteController r1 = new RemoteController();
      r1.setCommand(0, l22);
     // r1.setCommand(1, new LightCommand());
     r1.yahaparbuttonpresskiyajatah(0);
     r1.yahaparbuttonpresskiyajatah(0);
     
     r1.setCommand(1, fancommand);
     r1.yahaparbuttonpresskiyajatah(1);
      
      
		
	}
	

}
