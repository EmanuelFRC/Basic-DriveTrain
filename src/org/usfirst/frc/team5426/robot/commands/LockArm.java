package org.usfirst.frc.team5426.robot.commands;

public class LockArm extends CommandBase {

	public LockArm() {
		requires(shooter);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		shooter.setShaftMotorSpeed(-0.1);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		
		shooter.setShaftMotorSpeed(0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
