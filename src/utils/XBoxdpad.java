package utils;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class XBoxdpad extends Joystick {
	
	private static Joystick stick;
	
	/*
	 *   (FRC Driver Station XBox Controller POV section representation)
	 * 
	 *     3
	 *   2   4
	 * 1       5
	 *   8   6
	 *     7
	 * 
	 * 1 = buttonLeft
	 * 2 = buttonTopLeft
	 * 3 = buttonTop
	 * 4 = buttonTopRight
	 * 5 = buttonRight
	 * 6 = buttonBottomRight
	 * 7 = buttonBottom
	 * 8 = buttonBottomLeft
	 * 
	 */
	
	private Button buttonTopLeft;
	private Button buttonTop;
	private Button buttonTopRight;
	private Button buttonRight;
	private Button buttonBottomRight;
	private Button buttonBottom;
	private Button buttonBottomLeft;
	private Button buttonLeft;
	
	// I do not know if these values are correct
	private final int BUTTON_TOP_LEFT_PORT = 11;
	private final int BUTTON_TOP_PORT = 12;
	private final int BUTTON_TOP_RIGHT_PORT = 13;
	private final int BUTTON_RIGHT_PORT = 14;
	private final int BUTTON_BOTTOM_RIGHT_PORT = 15;
	private final int BUTTON_BOTTOM_PORT = 16;
	private final int BUTTON_BOTTOM_LEFT_PORT = 17;
	private final int BUTTON_LEFT_PORT = 18;
	
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
		return buttonTopLeft;
	}
	
	public Button getTopButton() {
		return buttonTop;
	}
	
	public Button getTopRightButton() {
		return buttonTopRight;
	}
	
	public Button getRightButton() {
		return buttonRight;
	}
	
	public Button getBottomRightButton() {
		return buttonBottomRight;
	}
	
	public Button getBottomButton() {
		return buttonBottom;
	}
	
	public Button getBottomLeftButton() {
		return buttonBottomLeft;
	}
	
	public Button getLeftButton() {
		return buttonLeft;
	}

}

