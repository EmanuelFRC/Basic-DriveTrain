package utils;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/*
 * TODO
 * 
 * Change all port numbers to constants DONE
 * Add function to filter out ghost values. Do not replace default getAxis functions
 * Add support for dpad and start/select buttons
 * Add limit function. If >1 or <-1 make them 1 or -1
 */
public class XBoxJoystick extends Joystick {

	private static Joystick stick;
	
	private Button buttonA;
	private Button buttonB;
	private Button buttonX;
	private Button buttonY;
	private Button leftBumperButton;
	private Button rightBumperButton;
	private Button leftStickPress;
	private Button rightStickPress;
	
	// Constant port values
	private static final int BUTTON_A_PORT = 0;
	private static final int BUTTON_B_PORT = 1;
	private static final int BUTTON_X_PORT = 2;
	private static final int BUTTON_Y_PORT = 3;
	private static final int LEFT_BUMPER_PORT = 4;
	private static final int RIGHT_BUMPER_PORT = 5;
	private static final int LEFT_STICK_PORT = 8;
	private static final int RIGHT_STICK_PORT = 9;
	
	
	public XBoxJoystick(int port) {
		super(port);
		stick = new Joystick(port);
		
		buttonA = new JoystickButton(stick, BUTTON_A_PORT);
		buttonB = new JoystickButton(stick, BUTTON_B_PORT);
		buttonX = new JoystickButton(stick, BUTTON_X_PORT);
		buttonY = new JoystickButton(stick, BUTTON_Y_PORT);
		leftBumperButton = new JoystickButton(stick, LEFT_BUMPER_PORT);
		rightBumperButton = new JoystickButton(stick, RIGHT_BUMPER_PORT);
		leftStickPress = new JoystickButton(stick, LEFT_STICK_PORT);
		rightStickPress = new JoystickButton(stick, RIGHT_STICK_PORT);
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
    	return -1 * stick.getRawAxis(1);
    }
    
    /**
     * @return Value of the left analog X axis
     */
    public double getLeftAxisX(){
    	return -1* stick.getRawAxis(0);
    }
    
    /**
     * @return Value of the right analog Y axis
     */
    public double getRightAxisY(){
    	return stick.getRawAxis(5);
    }
    
    /**
     * @return Value of the right analog X axis
     */
    public double getRightAxisX(){
    	return stick.getRawAxis(4);
    }
    
    public double getLeftTrigger(){
    	return stick.getRawAxis(2);
    }
    
    public double getRightTrigger(){
    	return stick.getRawAxis(3);
    }

}
