
package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.OI;
import org.usfirst.frc.team5426.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;

/**
 * Drives with the joystick
 */
public class SetShootArm extends CommandBase {
	
	public static DigitalInput limitSwitch = new DigitalInput(RobotMap.SHOOTER_LIMIT_SWITCH);
	
	public static DigitalInput getLimitSwitch() {
		return limitSwitch;
	}
	
    public SetShootArm() {
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//double speed = 0.1;
    	if (limitSwitch.getAnalogTriggerForRouting() == true) {
	    	if (!LockArm.locked) {
	    		double speed = OI.logitech.getY() / 2;
	    		shooter.setShaftMotorSpeed(speed);
	    	}
    	}
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
