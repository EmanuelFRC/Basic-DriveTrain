package utils;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class XBoxdpad extends Joystick {
	
	private static Joystick stick;
	
	private Button buttonTopLeft;
	private Button buttonTop;
	private Button buttonTopRight;
	private Button buttonRight;
	private Button buttonBottomRight;
	private Button buttonBottom;
	private Button buttonBottomLeft;
	private Button buttonLeft;
	
	private static int BUTTON_TOP_LEFT_PORT = 11;
	private static int BUTTON_TOP_PORT = 12;
	private static int BUTTON_TOP_RIGHT_PORT = 13;
	private static int BUTTON_RIGHT_PORT = 14;
	private static int BUTTON_BOTTOM_RIGHT_PORT = 15;
	private static int BUTTON_BOTTOM_PORT = 16;
	private static int BUTTON_BOTTOM_LEFT_PORT = 17;
	private static int BUTTON_LEFT_PORT = 18;
	
	public XBoxdpad(int port) {
		super(port);
		stick = new Joystick(port);
		
		buttonTopLeft = new JoystickButton(stick, BUTTON_TOP_LEFT_PORT);
		buttonTop = new JoystickButton(stick, BUTTON_TOP_PORT);
		buttonTopRight = new JoystickButton(stick, BUTTON_TOP_RIGHT_PORT);
		buttonRight = new JoystickButton(stick, BUTTON_RIGHT_PORT);
		buttonBottomRight = new JoystickButton(stick, BUTTON_BOTTOM_RIGHT_PORT);
		buttonBottom = new JoystickButton(stick, BUTTON_BOTTOM_PORT);
		buttonBottomLeft = new JoystickButton(stick, BUTTON_BOTTOM_LEFT_PORT);
		buttonLeft = new JoystickButton(stick, BUTTON_LEFT_PORT);
	}
	
	public Button getTopLeftButton() {
		return this.buttonTopLeft;
	}
	
	public Button getTopButton() {
		return this.buttonTop;
	}
	
	public Button getTopRightButton() {
		return this.buttonTopRight;
	}
	
	public Button getRightButton() {
		return this.buttonRight;
	}
	
	public Button getBottomRightButton() {
		return this.buttonBottomRight;
	}
	
	public Button getBottomButton() {
		return this.buttonBottom;
	}
	
	public Button getBottomLeftButton() {
		return this.buttonBottomLeft;
	}
	
	public Button getLeftButton() {
		return this.buttonLeft;
	}

}
