package org.usfirst.frc.team5426.robot;
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


    //Port: CAN
    //Type: DRIVETRAIN MOTORS TALONS SRX
    public static final int LEFT_MOTOR = 4;
    public static final int LEFT_BACK_MOTOR = 2;
    public static final int RIGHT_MOTOR = 3;
    public static final int RIGHT_BACK_MOTOR = 1;
    
    //Port: PWN
    //Type: SHOOTER MOTORS TALONS
    public static final int LEFT_SPINNER = 0;
    public static final int RIGHT_SPINNER = 1;
    
    public static final int ULTRA_ECHO = 1;
    public static final int ULTRA_PULSE = 0;

}
