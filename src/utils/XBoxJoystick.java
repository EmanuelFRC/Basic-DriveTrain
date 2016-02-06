package utils;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/*
 * TODO
 * 
 * Change all port numbers to constants
 * Add function to filter out ghost values. Do not replace default getAxis functions
 * Add support for dpad and start/select buttons
 * Add limit function. If >1 or <-1 make them 1 or -1
 */
public class XBoxJoystick extends Joystick {

	private Button buttonA;
	private Button buttonB;
	private Button buttonX;
	private Button buttonY;
	private Button leftBumperButton;
	private Button rightBumperButton;
	private Button leftStickPress;
	private Button rightStickPress;
	
	public XBoxJoystick(int port) {
		super(port);
		
		buttonA = new JoystickButton(this, 0);
		buttonB = new JoystickButton(this, 1);
		buttonX = new JoystickButton(this, 2);
		buttonY = new JoystickButton(this, 3);
		leftBumperButton = new JoystickButton(this, 4);
		rightBumperButton = new JoystickButton(this, 5);
		leftStickPress = new JoystickButton(this, 8);
		rightStickPress = new JoystickButton(this, 9);
	}

	public Button getButtonA() {
		return buttonA;
	}

	public Button getButtonB() {
		return buttonB;
	}

	public Button getButtonX() {
		return buttonX;
	}

	public Button getButtonY() {
		return buttonY;
	}

	public Button getLeftBumperButton() {
		return leftBumperButton;
	}

	public Button getRightBumperButton() {
		return rightBumperButton;
	}

	public Button getLeftStickPress() {
		return leftStickPress;
	}

	public Button getRightStickPress() {
		return rightStickPress;
	}

	/**
     * @return Value of the left analog Y axis
     */
    public double getLeftAxisY(){
    	return -this.getRawAxis(1);
    }
    
    /**
     * @return Value of the left analog X axis
     */
    public double getLeftAxisX(){
    	return -this.getRawAxis(0);
    }
    
    /**
     * @return Value of the right analog Y axis
     */
    public double getRightAxisY(){
    	return this.getRawAxis(5);
    }
    
    /**
     * @return Value of the right analog X axis
     */
    public double getRightAxisX(){
    	return this.getRawAxis(4);
    }
    
    public double getLeftTrigger(){
    	return this.getRawAxis(2);
    }
    
    public double getRightTrigger(){
    	return this.getRawAxis(3);
    }

}
