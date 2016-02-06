package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter extends Subsystem {

	private Talon mLeftSpinner;
	private Talon mRightSpinner;
	private Ultrasonic mUltrasonic;
	
	//private static final double INTAKE_SPEED = 0.3;
	//private static final double SHOOT_SPEED = 0.3;
	private double INTAKE_SPEED;
	private double SHOOT_SPEED;
	
	// I had these in a constants file but just moved them to their specific subsystem
	public static final String INTAKE_SPEED_KEY = "intake speed";
	public static final double INTAKE_SPEED_VALUE = 0.15;
	public static final String SHOOT_SPEED_KEY = "shoot speed";
	public static final double SHOOT_SPEED_VALUE = 0.30;

	public Shooter() {
		mLeftSpinner = new Talon(RobotMap.LEFT_SPINNER);
		mRightSpinner = new Talon(RobotMap.RIGHT_SPINNER);
		INTAKE_SPEED = Preferences.getInstance().getDouble(INTAKE_SPEED_KEY, INTAKE_SPEED_VALUE);
		SHOOT_SPEED = Preferences.getInstance().getDouble(SHOOT_SPEED_KEY, SHOOT_SPEED_VALUE);
		
		mUltrasonic = new Ultrasonic(RobotMap.ULTRA_ECHO, RobotMap.ULTRA_PULSE);
		mUltrasonic.setAutomaticMode(true);
		
		SmartDashboard.putNumber("Distance", getRange());
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	
	public void intake() {
		mLeftSpinner.set(INTAKE_SPEED);
		mRightSpinner.set(-1 * INTAKE_SPEED);
	}
	
	public void shoot() {
		mLeftSpinner.set(-1 * SHOOT_SPEED);
		mRightSpinner.set(SHOOT_SPEED);
	}
	
	public void stop() {
		mLeftSpinner.set(0);
		mRightSpinner.set(0);
	}
	
	public double getRange() {
		return mUltrasonic.getRangeInches();
	}
	
}
