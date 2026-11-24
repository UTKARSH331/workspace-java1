package com.command.design.pattern;

interface ICommand{
	void execute();
	void undo();
}

class Light{
	public void on() {
		System.out.println("light is on ");
	}
	public void off() {
		System.out.println("Light is off");
	}
}

class Fan{
	public void on() {
		System.out.println("light is on ");
	}
	public void off() {
		System.out.println("Light is off");
	}
}

class LightCommand implements ICommand{
    private  Light l;
      
	public LightCommand(Light l) {
		super();
		this.l = l;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		l.on();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		l.off();
	}	
}

class FanCommand implements ICommand{
    private  Fan f;
      
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

class RemoteController{
	private static final int numButtons = 4;
	private ICommand[] buttons;
	private boolean[] pressButton;
	public RemoteController(ICommand[] buttons, boolean[] pressButton) {
		super();
		this.buttons = new ICommand[numButtons];
		this.pressButton = new boolean[numButtons];
		for(int i = 0; i<numButtons; i++) {
			buttons[i] = null;
			pressButton[i] = false;
		}
	}

public void setCommand(int idx, ICommand cmd) {
	if(idx >= 0 && idx < numButtons) {
		buttons[idx] = cmd;
		pressButton[idx] = true;
	}
}
public void buttonPressed(int idx) {
	if(idx >= 0 && idx <numButtons && buttons[idx] != null) {
		if(!pressButton[idx]) {
			buttons[idx].execute();
		} else {
			buttons[idx].undo();
		}
		pressButton[idx] = !pressButton[idx];
	} else {
		System.out.println("no command assign at button " + idx);
	}
}
}

public class Driver {

	public static void main(String[] args) {
		
	}

}
