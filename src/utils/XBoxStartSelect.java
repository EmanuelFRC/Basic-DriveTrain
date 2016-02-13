package utils;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class XBoxStartSelect extends Joystick {
	
	private Joystick stick;
	
	private Button startButton;
	private Button selectButton;
	
	private final static int START_BUTTON_PORT = 0;
	private final static int SELECT_BUTTON_PORT = 0;
	
	public XBoxStartSelect(int port) {
		super(port);
		stick = new Joystick(port);
		
		startButton = new JoystickButton(stick, START_BUTTON_PORT);
		selectButton = new JoystickButton(stick, SELECT_BUTTON_PORT);
	}
	
	public Button getStartButton() {
		return this.startButton;
	}
	
	public Button getSelectButton() {
		return this.selectButton;
	}
	
	

}
