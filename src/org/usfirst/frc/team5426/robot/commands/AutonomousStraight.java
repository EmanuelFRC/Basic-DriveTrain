package org.usfirst.frc.team5426.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousStraight extends CommandGroup {
	
	public AutonomousStraight() {
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
		this.addSequential(new AutonomousLift(0.2, 3));
		this.addSequential(new AutonomousDrive(0.72, 0, 4));
	}

}
