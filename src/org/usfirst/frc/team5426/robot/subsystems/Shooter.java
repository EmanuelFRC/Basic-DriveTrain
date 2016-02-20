package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;
import org.usfirst.frc.team5426.robot.commands.SetShootArm;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter extends Subsystem {
	
	private Victor mLeftSpinner;
	private Victor mRightSpinner;
	private Victor mShaftMotor;
	
	private double mIntakeSpeed;
	private double mShootSpeed;
	
	//private Solenoid mSolenoid;
	private DigitalInput mBackLimitSwitch;
	
	public static final String INTAKE_SPEED_KEY = "intakeSpeed";
	public static final double INTAKE_SPEED_VALUE = 0.15;
	public static final String SHOOT_SPEED_KEY = "shootSpeed";
	public static final double SHOOT_SPEED_VALUE = 0.30;
	
	public Shooter() {
		mLeftSpinner = new Victor(RobotMap.LEFT_SPINNER);
		mRightSpinner = new Victor(RobotMap.RIGHT_SPINNER);
		mShaftMotor = new Victor(RobotMap.SHAFT_MOTOR);
		mIntakeSpeed = INTAKE_SPEED_VALUE;
		mShootSpeed = SHOOT_SPEED_VALUE;
		
		//mSolenoid = new Solenoid(RobotMap.SOLENOID_PORT);		
		mBackLimitSwitch = new DigitalInput(RobotMap.BACK_LIMIT_SWITCH);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new SetShootArm());
	}
	
	public void intake() {
		mLeftSpinner.set(mIntakeSpeed);
		mRightSpinner.set(-1 * mIntakeSpeed);
	}
	
	public void shoot() {
		//mSolenoid.set(false);
		mLeftSpinner.set(-1 * mShootSpeed);
		mRightSpinner.set(mShootSpeed);
		
	}
	
	public void stop() {
		mLeftSpinner.set(0);
		mRightSpinner.set(0);
		//mSolenoid.set(true);
	}

	/*@Override
	public void onConstantsUpdate() {
		System.out.println("Updating shooter constants!");
		
		Constants.get().reload();
		
		mIntakeSpeed = Double.parseDouble(
				Constants.prop().getProperty(INTAKE_SPEED_KEY, INTAKE_SPEED_VALUE));
		mShootSpeed = Double.parseDouble(
				Constants.prop().getProperty(SHOOT_SPEED_KEY, SHOOT_SPEED_VALUE));
		
		SmartDashboard.putNumber(INTAKE_SPEED_KEY, mIntakeSpeed);
		SmartDashboard.putNumber(SHOOT_SPEED_KEY, mShootSpeed);
	}*/

	/*
	public void setConstants() {
		mIntakeSpeed = 
				.setProperty(INTAKE_SPEED_KEY, INTAKE_SPEED_VALUE);
		Constants.prop()
				.setProperty(SHOOT_SPEED_KEY, SHOOT_SPEED_VALUE);
	}*/
	
	public void setShaftMotorSpeed(double speed) {
    	if (speed >= 0.3)
    		speed = 0.3;
    	if (speed <= -0.3)
    		speed = -0.3;
    	
    	SmartDashboard.putNumber("speed", speed);

    	if (mBackLimitSwitch.get() == false) {
    		mShaftMotor.set(speed);
    	} else {
    		stopShaftMotor();
    	}
	}
	
	public void stopShaftMotor() {
		mShaftMotor.set(0);
	}
	
	/*public Solenoid getSolenoid() {
		return mSolenoid;
	}*/
	
	public DigitalInput getBackLimitSwitch() {
		return mBackLimitSwitch;
	}
	
}
