package org.usfirst.frc.team5426.robot.commands;

public class IntakeBall extends CommandBase {

	private double mTimeout;
	
	public IntakeBall(double timeout) {
		requires(shooter);
		mTimeout = timeout;
	}
	
	@Override
	protected void initialize() {
		setTimeout(mTimeout);
		shooter.intake();
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
		shooter.stop();
	}

	@Override
	protected void interrupted() {
		shooter.stop();
	}

}
