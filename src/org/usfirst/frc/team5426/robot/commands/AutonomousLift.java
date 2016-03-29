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
		shooter.setShaftMotorSpeed(moveSpeed);
	}

	@Override
	protected void initialize() {
		this.setTimeout(time);
	}

	@Override
	protected void interrupted() {
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
