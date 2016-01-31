package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;

import utils.Keys;
import utils.Prefs;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

	private Talon mLeftSpinner;
	private Talon mRightSpinner;
	
	//private static final double INTAKE_SPEED = 0.3;
	//private static final double SHOOT_SPEED = 0.3;
	private double INTAKE_SPEED;
	private double SHOOT_SPEED;

	public Shooter() {
		mLeftSpinner = new Talon(RobotMap.LEFT_SPINNER);
		mRightSpinner = new Talon(RobotMap.RIGHT_SPINNER);
		INTAKE_SPEED = Prefs.get().getDouble(Keys.INTAKE_SPEED_KEY, Keys.INTAKE_SPEED_VALUE);
		SHOOT_SPEED = Prefs.get().getDouble(Keys.SHOOT_SPEED_KEY, Keys.SHOOT_SPEED_VALUE);
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
	
}