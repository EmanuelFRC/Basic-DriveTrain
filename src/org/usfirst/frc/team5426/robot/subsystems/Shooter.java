package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;

import utils.Constants;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter extends Subsystem 
	implements Constants.Callbacks {

	private Talon mLeftSpinner;
	private Talon mRightSpinner;
	
	private double mIntakeSpeed;
	private double mShootSpeed;
	
	public static final String INTAKE_SPEED_KEY = "intakeSpeed";
	public static final String INTAKE_SPEED_VALUE = "0.15";
	public static final String SHOOT_SPEED_KEY = "shootSpeed";
	public static final String SHOOT_SPEED_VALUE = "0.30";

	public Shooter() {
		mLeftSpinner = new Talon(RobotMap.LEFT_SPINNER);
		mRightSpinner = new Talon(RobotMap.RIGHT_SPINNER);
		setConstants();
		onConstantsUpdate();
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	
	public void intake() {
		mLeftSpinner.set(mIntakeSpeed);
		mRightSpinner.set(-1 * mIntakeSpeed);
	}
	
	public void shoot() {
		mLeftSpinner.set(-1 * mShootSpeed);
		mRightSpinner.set(mShootSpeed);
	}
	
	public void stop() {
		mLeftSpinner.set(0);
		mRightSpinner.set(0);
	}

	@Override
	public void onConstantsUpdate() {
		System.out.println("Updating shooter constants!");
		
		Constants.get().reload();
		
		mIntakeSpeed = Double.parseDouble(
				Constants.prop().getProperty(INTAKE_SPEED_KEY, INTAKE_SPEED_VALUE));
		mShootSpeed = Double.parseDouble(
				Constants.prop().getProperty(SHOOT_SPEED_KEY, SHOOT_SPEED_VALUE));
		
		SmartDashboard.putNumber(INTAKE_SPEED_KEY, mIntakeSpeed);
		SmartDashboard.putNumber(SHOOT_SPEED_KEY, mShootSpeed);
	}

	@Override
	public void setConstants() {
		Constants.prop()
				.setProperty(INTAKE_SPEED_KEY, INTAKE_SPEED_VALUE);
		Constants.prop()
				.setProperty(SHOOT_SPEED_KEY, SHOOT_SPEED_VALUE);		
	}
	
}
