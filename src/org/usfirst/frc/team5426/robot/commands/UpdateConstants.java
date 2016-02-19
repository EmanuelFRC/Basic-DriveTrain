package org.usfirst.frc.team5426.robot.commands;

import utils.Constants;

/**
 * Bind this command to a button, and click it whenever the
 * constants file is updated. In OI add:
 * SmartDashboard.putData("Update Constants", new UpdateConstants());
 * 
 * @author Emanuel
 *
 */
public class UpdateConstants extends CommandBase {

	@Override
	protected void initialize() {
		requires(shooter);
		
	}

	@Override
	protected void execute() {
		// shooter.onConstantsUpdate();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
