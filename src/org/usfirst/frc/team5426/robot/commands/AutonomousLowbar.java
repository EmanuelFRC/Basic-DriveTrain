package org.usfirst.frc.team5426.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousLowbar extends CommandGroup {
	
	public AutonomousLowbar() {
		/* 
		 * This is run as soon as the command is called
		 * The first double is the 'mv' value
		 * The second is the 'rv' value
		 * The third is the 's' value
		 * 
		 * All these values are required for the AutonomousDrive command.
		 */
		
		
		/*
		 *  The last value ('s' or speed) will change depending when we know how long it'll take
		 *  for the robot to reach the first obstacle.
		 */
		addSequential(new AutonomousLift(1, 3.75));
		addSequential(new AutonomousDrive(0.92, 0, 1.25));
		addSequential(new AutonomousShoot(1));
		addSequential(new AutonomousDrive(-0.91, 0, 1.35));
	}

}
