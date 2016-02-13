
package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.OI;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Drives with the joystick
 */
public class LiftJoystick extends CommandBase {

    public LiftJoystick() {
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double speed = OI.getRightAxisY();
    	/*if (speed >= 0.5)
    		speed = 0.5;
    	if (speed <= -0.5)
    		speed = -0.5;*/
		shooter.setShaftMotorSpeed(speed);
		//driveTrain.arcadeDrive(OI.xBoxJoystick.getLeftAxisY(), OI.xBoxJoystick.getLeftAxisX(), true);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
