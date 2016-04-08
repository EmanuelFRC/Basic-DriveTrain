package org.usfirst.frc.team5426.robot.commands;

public class AutonomousLift extends CommandBase {
	
	public double moveSpeed;
	public double time;
	
	public AutonomousLift(double mv, double t) {
		this.moveSpeed = mv;
		this.time = t;
	}
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		
		/*
		 * This sets the shaft motor to move to the position that is passed when a new instance
		 * of this command is called.
		 */
		shooter.setShaftMotorSpeed(moveSpeed);
		setTimeout(time);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void interrupted() {
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

}
