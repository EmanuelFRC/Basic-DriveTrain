package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
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
	
	private CANTalon mLeftLift;
	private CANTalon mRightLift;
	
	@Override
	protected void initDefaultCommand() {
	}
	
	public Lift() {
		mLeftLift = new CANTalon(RobotMap.LEFT_LIFT);
		mRightLift = new CANTalon(RobotMap.RIGHT_LIFT);
	}
	
	/*
	 * I think they should be the same. If this doesnt work, change the order around
	 */
	public void setLiftSpeed(double speed) {
		mRightLift.set(speed);
		mLeftLift.set(speed);
		
	}
	
	public void stopLift() {
		mRightLift.set(0.0);
		mLeftLift.set(0.0);
		;
	}
	
}
