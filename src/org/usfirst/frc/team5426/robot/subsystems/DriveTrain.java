package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;
import org.usfirst.frc.team5426.robot.commands.DriveJoystick;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;

public class DriveTrain extends Subsystem {

	/*
		Each motor is initialized as the appropriate class. Each motor is its own object (variable).
		Example, our build used the TalonSRX, so the right class to use is CANTalon. If you used regular
		Talons, you would use the Talon class.
	 */
	private Talon mLeftMotor;
	private Talon mLeftBackMotor;
	private Talon mRightMotor;
	private Talon mRightBackMotor;

	private RobotDrive myRobot;

	private Accelerometer mBuiltInAccelerometer;
	//private Ultrasonic mUltrasonic;
	
	
	public DriveTrain() {
		mLeftMotor = new Talon(RobotMap.LEFT_MOTOR);
		mLeftBackMotor = new Talon(RobotMap.LEFT_BACK_MOTOR);
		mRightMotor = new Talon(RobotMap.RIGHT_MOTOR);
		mRightBackMotor = new Talon(RobotMap.RIGHT_BACK_MOTOR);
		
		//RobotDrive takes the following port numbers:
		//RobotDrive(left back, left front, right back, right front)
		myRobot = new RobotDrive(mLeftBackMotor, mLeftMotor, mRightBackMotor, mRightMotor);
		
		mBuiltInAccelerometer = new BuiltInAccelerometer();
		
		//mUltrasonic = new Ultrasonic(RobotMap.ULTRA_PULSE, RobotMap.ULTRA_ECHO);
		//mUltrasonic.setAutomaticMode(true);
		//SmartDashboard.putNumber("Distance (in)", mUltrasonic.getRangeInches());
	}

	public void initDefaultCommand() {
		setDefaultCommand(new DriveJoystick());
	}
	
	/**
	 * @param leftAxisY Move value from -1 to 1
	 * @param leftAxisX Rotate Value from -1 to 1
	 * @param b Sensitivity
	 */
	public void customArcadeDrive(double leftAxisY, double leftAxisX, boolean sensitivity) {
		/*
			arcadeDrive is a default function that will power the motors in the correct way
			to get the robot moving based on the joystick input. It will drive exactly how you would
			expect a car in any video game.
		*/
		myRobot.arcadeDrive(cubeInput(leftAxisY), cubeInput(leftAxisX));
	}
	
	public Accelerometer getBuiltInAccelerometer() {
		return mBuiltInAccelerometer;
	}
	
	private double cubeInput(double i) {
		return Math.pow(i, 3);
	}
	
	
	/*public Ultrasonic getUltrasonic() {
		return mUltrasonic;
	}*/
	
}
