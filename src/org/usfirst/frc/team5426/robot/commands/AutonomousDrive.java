package org.usfirst.frc.team5426.robot.commands;

public class AutonomousDrive extends CommandBase {
	
	private double moveValue, rotateValue, time;
	
	public AutonomousDrive(double mv, double rv, double s) {
		
		requires(driveTrain);
		
		moveValue = mv;
		rotateValue = rv;
		time = s;
	}
	
	@Override
	protected void end() {
	}

	@Override
	protected void execute() {
		driveTrain.customArcadeDrive(this.moveValue, this.rotateValue, true);
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
