package utils;

import edu.wpi.first.wpilibj.Joystick;

public class LogitechJoystick extends Joystick {
	
	private static Joystick stick;
	
	private double joystickX;
	private double joystickY;
	private double joystickZ;
	
	public LogitechJoystick(int port) {
		super(port);
		stick = new Joystick(port);
	}
	
	public double getYAxis() {
		return stick.getY();
	}
	
	public double getXAxis() {
		return stick.getX();
	}

}
