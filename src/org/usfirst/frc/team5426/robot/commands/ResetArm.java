package org.usfirst.frc.team5426.robot.commands;

public class ResetArm extends CommandBase {

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		shooter.setShaftMotorSpeed(0.2);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void interrupted() {
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	
	

}
