package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.OI;

public class LockArm extends CommandBase {

	public static boolean locked;
	
	public LockArm() {
		requires(shooter);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		shooter.setShaftMotorSpeed(OI.getRightAxisY());
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		shooter.setShaftMotorSpeed(OI.getRightAxisY());
		locked = true;
		
		if (!locked)
			locked = true;
		else
			locked = false;
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
