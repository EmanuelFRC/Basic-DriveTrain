package org.usfirst.frc.team5426.robot.commands;

public class AutonomousDrive extends CommandBase {
	
	public double moveValue;
	public double rotateValue;
	public double time;
	
	public AutonomousDrive(double mv, double rv, double s) {
		
		/*
		 * 
		 */
		
		requires(driveTrain);
		
		this.moveValue = mv;
		this.rotateValue = rv;
		this.time = s;
	}
	
	@Override
	protected void end() {
	}

	@Override
	protected void execute() {
		
		driveTrain.customArcadeDriveAuto(this.moveValue, this.rotateValue, this.time);
		this.setTimeout(time);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void interrupted() {
	}

	@Override
	protected boolean isFinished() {
		return this.isTimedOut();
	}

}
