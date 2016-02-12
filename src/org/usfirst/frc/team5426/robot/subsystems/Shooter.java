package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;
import org.usfirst.frc.team5426.robot.commands.LiftJoystick;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

	private Talon mLeftSpinner;
	private Talon mRightSpinner;
	private Talon mShaftMotor;
	
	//private static final double INTAKE_SPEED = 0.3;
	//private static final double SHOOT_SPEED = 0.3;
	private double INTAKE_SPEED;
	private double SHOOT_SPEED;
	
	public Shooter(double intake, double shoot) {
		mLeftSpinner = new Talon(RobotMap.LEFT_SPINNER);
		mRightSpinner = new Talon(RobotMap.RIGHT_SPINNER);
		mShaftMotor = new Talon(RobotMap.SHAFT_MOTOR);

		INTAKE_SPEED = intake;
		SHOOT_SPEED = shoot;
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new LiftJoystick());	
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
	
	public void setShaftMotorSpeed(double speed) {
		mShaftMotor.set(speed);
	}
	
	public void stopShaftMotor() {
		mShaftMotor.set(0);
	}
	
}
