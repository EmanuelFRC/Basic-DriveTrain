package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;
import org.usfirst.frc.team5426.robot.commands.DriveJoystick;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain extends Subsystem {

	/*
		Each motor is initialized as the appropriate class. Each motor is its own object (variable).
		Example, our build used the TalonSRX, so the right class to use is CANTalon. If you used regular
		Talons, you would use the Talon class.
	 */
	private CANTalon mLeftMotor;
	private CANTalon mLeftBackMotor;
	private CANTalon mRightMotor;
	private CANTalon mRightBackMotor;

	private RobotDrive myRobot;

	private BuiltInAccelerometer mBuiltInAccelerometer;
	//private Ultrasonic mUltrasonic;


	public DriveTrain() {
		//motor = new CANTAlon(port number);
		//Remember when we learned RobotMap.LEFT_MOTOR is actually just the number 2? Look at RobotMap class
		//The line below is the same thing as: mLeftMotor = new CANTalon(2);

		mLeftMotor = new CANTalon(RobotMap.LEFT_MOTOR);
		mLeftBackMotor = new CANTalon(RobotMap.LEFT_BACK_MOTOR);
		mRightMotor = new CANTalon(RobotMap.RIGHT_MOTOR);
		mRightBackMotor = new CANTalon(RobotMap.RIGHT_BACK_MOTOR);

		//RobotDrive takes the following port numbers:
		//RobotDrive(left back, left front, right back, right front)
		myRobot = new RobotDrive(mLeftBackMotor, mLeftMotor, mRightBackMotor, mRightMotor);

		mBuiltInAccelerometer = new BuiltInAccelerometer();
		SmartDashboard.putNumber("Accel X (g)", mBuiltInAccelerometer.getX());
		SmartDashboard.putNumber("Accel Y (g)", mBuiltInAccelerometer.getY());
		SmartDashboard.putNumber("Accel Z (g)", mBuiltInAccelerometer.getZ());

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
		myRobot.arcadeDrive(leftAxisY, leftAxisX, sensitivity);
	}

	public BuiltInAccelerometer getBuiltInAccelerometer() {
		return mBuiltInAccelerometer;
	}

	/*public Ultrasonic getUltrasonic() {
		return mUltrasonic;
	}*/

}