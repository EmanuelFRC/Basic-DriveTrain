package org.usfirst.frc.team5426.robot.triggers;

import org.usfirst.frc.team5426.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.buttons.Trigger;

public class BallNearby extends Trigger {

	@Override
	public boolean get() {
		return (CommandBase.driveTrain.getUltrasonic().getRangeInches() < 4);
	}

}
