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
	
	/*
	 * If no programmers are available to test, read this.
	 * 
	 * The things that say LEFT_SPINNER and RIGHT_SPINNER below this comment define the ports.
	 * For example, public static final int LEFT_SPINNER = 0; says that the port the left spinner victor is plugged into is port 0.
	 * 
	 * If you want to transform Victors into Talons or Talons into CANTalons, you must find the appropriate system where the
	 * motors are defined and change the type.
	 * 
	 * For example, if you want to make the shooter use Talons instead of Victors, you'd expand the Subsystems package in the left bar
	 * and find Shooter.java. Double click the file to open it into eclipse and look around the top. You should see a object declaration
	 * for the Victors that looks like the following: 
	 * 
	 * private Victor mLeftSpinner;
	 * 
	 * Ignore "private" and "mLeftSpinner;". You don't want to touch those. To change it into a Talon, simply change Victor to Talon.
	 * Be sure to capitalise the first letter, Java is very case sensitive. You will then see a red line appear underneath something
	 * a bit later in the file that looks like this:
	 * 
	 * mLeftSpinner = new Victor(RobotMap.LEFT_SPINNER);
	 * 
	 * Where it says "new Victor", change "Victor" to Talon or whatever else you're using.
	 * 
	 * It's pretty much the same thing in DriveTrain.java, but things will be named differently.
	 * You can use either Talons, CANTalons or Victors.
	 * 
	 * 
	 * To send the code to the robot, you must first connect to the Robot's WIFI network, it starts with a 5 and is 4 digits long.
	 * Click on the run button (on the top bar, it's the green button with a white triangle) and pick WPILib Java Deploy.
	 * 
	 * Open FRC Driver Station, make sure it's set to TeleOperated and click on Enable. If the code is written properly, everything should work fine.
	 * 
	 * If you need clarification, email me at esniddunc@cscprovidence.ca
	 * 
	 * Good luck!
	 * 
	 */
	
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
    public static final int SHOOTER_LIMIT_SWITCH = 2;
	
    
    //Port: CAN
    public static final int LEFT_LIFT = 0;
	public static final int RIGHT_LIFT = 1;
    public static final int SHAFT_MOTOR = 2;
    
}
