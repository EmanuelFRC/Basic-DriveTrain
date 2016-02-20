package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lift extends Subsystem{

	/**
	 * Todo:
	 * -Install limit switches and set it to stop at the top/bottom
	 * -Or encoders
	 */
	
	/*
	 * I changed the CANTalons to Victors since we are not currently using Talons
	 */
	
	private Victor mLeftLift;
	private Victor mRightLift;
	
	@Override
	protected void initDefaultCommand() {
	}
	
	public Lift() {
		mLeftLift = new Victor(RobotMap.LEFT_LIFT);
		mRightLift = new Victor(RobotMap.RIGHT_LIFT);
	}
	
	/*
	 * I think they should be the same. If this doesnt work, change the order around
	 */
	public void setLiftSpeed(double speed) {
		mLeftLift.set(speed);
		mRightLift.set(speed);
	}
	
	public void stopLift() {
		mLeftLift.set(0.0);
		mRightLift.set(0.0);
	}
	
}
