package org.usfirst.frc.team5426.robot.commands;

public class LiftUp extends CommandBase {

	private double mTimeout;
	
	public LiftUp(double timeout) {
		requires(lift);
		mTimeout = timeout;
	}
	
	@Override
	protected void initialize() {
		setTimeout(mTimeout);
		lift.setLiftSpeed(1);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	@Override
	protected void end() {
		lift.stopLift();
	}

	@Override
	protected void interrupted() {
		lift.stopLift();
	}

}
