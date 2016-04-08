package org.usfirst.frc.team5426.robot;

import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 *
 * RobotMap is basically a file that stores all your variables and constants so you can refer
 * to them by name in later places in the code. For example, if you want to access the cLeftMotor
 * value, you would type 'RobotMap.cLeftMotor', which is the same thing as '2';
 */
public class RobotMap {
    //Your actual port numbers will change depending on how you wired your robot. It's the number on the
    //roboRIO
	
	// PWM (For the Talon motor controllers)
	public static final int LEFT_MOTOR = 2;
    public static final int LEFT_BACK_MOTOR = 4;
    public static final int RIGHT_MOTOR = 3;
    public static final int RIGHT_BACK_MOTOR = 5;
    // These ports will not be known until they are installed
    public static final int LEFT_SPINNER = 0;
    public static final int RIGHT_SPINNER = 1;
    
    //PCM
    public static final int SOLENOID_PORT = 0;
    public static final int ULTRA_ECHO = 1;
    public static final int ULTRA_PULSE = 2;
    
    //DIO
    public static final int BACK_LIMIT_SWITCH = 0;
    public static final int ARM_LIMIT_SWITCH = 1;
    public static final int SHOOTER_LIMIT_SWITCH = 9;
	
    
    //Port: CAN
    public static final int LEFT_LIFT = 0;
	public static final int RIGHT_LIFT = 1;
    public static final int SHAFT_MOTOR = 2;
    
}
