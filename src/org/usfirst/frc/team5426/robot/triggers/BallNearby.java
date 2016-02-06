package org.usfirst.frc.team5426.robot.triggers;

import edu.wpi.first.wpilibj.buttons.Trigger;

public class BallNearby extends Trigger {

	@Override
	public boolean get() {
		//return (CommandBase.driveTrain.getUltrasonic().getRangeInches() < 4);
		return false;
		//&& CommandBase.oi.xBoxJoystick.getButtonX().get();
		//xBoxJoystick is set to port 1. fix later
	}

}
