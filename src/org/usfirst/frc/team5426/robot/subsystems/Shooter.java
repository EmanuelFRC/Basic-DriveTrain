package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;
import org.usfirst.frc.team5426.robot.commands.LiftJoystick;

import utils.Constants;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter extends Subsystem {

	private Talon mLeftSpinner;
	private Talon mRightSpinner;
	private CANTalon  mShaftMotor;
	
	private double mIntakeSpeed;
	private double mShootSpeed;
	
	// Created a new solenoid
	public static Solenoid solenoid;
	
	public static final String INTAKE_SPEED_KEY = "intakeSpeed";
	public static final double INTAKE_SPEED_VALUE = 0.15;
	public static final String SHOOT_SPEED_KEY = "shootSpeed";
	public static final double SHOOT_SPEED_VALUE = 0.30;
	
	private final int SOLENOID_PORT = 0;
	
	public Shooter() {
		//mLeftSpinner = new Talon(RobotMap.LEFT_SPINNER);
		//mRightSpinner = new Talon(RobotMap.RIGHT_SPINNER);
		mShaftMotor = new CANTalon(RobotMap.SHAFT_MOTOR);
		mIntakeSpeed = INTAKE_SPEED_VALUE;
		mShootSpeed = SHOOT_SPEED_VALUE;
		
		// Defining the solenoid object
		solenoid = new Solenoid(SOLENOID_PORT);
		// Allows solenoid to be used
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new LiftJoystick());	
	}
	
	public void intake() {
		mLeftSpinner.set(mIntakeSpeed);
		mRightSpinner.set(-1 * mIntakeSpeed);
	}
	
	public void shoot() {
		solenoid.set(false);
		mLeftSpinner.set(-1 * mShootSpeed);
		mRightSpinner.set(mShootSpeed);
		
	}
	
	public void stop() {
		mLeftSpinner.set(0);
		mRightSpinner.set(0);
		solenoid.set(true);
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
		mShaftMotor.set(speed);
	}
	
	public void stopShaftMotor() {
		mShaftMotor.set(0);
	}
	
}
