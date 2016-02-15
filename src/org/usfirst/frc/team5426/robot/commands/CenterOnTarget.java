package org.usfirst.frc.team5426.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import utils.GRIPVision;
import utils.VisionHelper;
import utils.VisionHelper.Direction;

public class CenterOnTarget extends CommandBase {

	private double startPosition;
	private double endPosition;
	private double currentPosition;
	
	public CenterOnTarget() {
		requires(driveTrain);
	}
	
	@Override
	protected void initialize() {
		startPosition = GRIPVision.get().getContours().get(0).getCenterX();
		endPosition = (GRIPVision.screenWidth)/2;
		currentPosition = startPosition;
	}

	@Override
	protected void execute() {
		String directionString = "";
		Direction direction = VisionHelper.getDirection(currentPosition, endPosition);
		switch (direction) {
			case LEFT:
				directionString = "left";
				//driveTrain.customArcadeDrive(0, -0.2, false);
				break;
			case RIGHT:
				directionString = "right";
				//driveTrain.customArcadeDrive(0, 0.2, false);
				break;
			default:
				directionString = "idk";
				break;
		}
		
		/*
		SmartDashboard.putNumber("Start Position", startPosition);
		SmartDashboard.putNumber("Current Position", currentPosition);
		SmartDashboard.putNumber("End Position", endPosition);
		SmartDashboard.putString("Direction", directionString);
		*/
		
		System.out.println("Currently at: " + currentPosition
				+ " and heading to the " + directionString
				+ " towards " + endPosition + ".");
	}

	@Override
	protected boolean isFinished() {
		boolean inRange = VisionHelper.inRange(100, currentPosition, endPosition);
		System.out.println("In Range?: " + inRange);
		return inRange;
	}

	@Override
	protected void end() {
		System.out.println("I've arrived");
		driveTrain.customArcadeDrive(0, 0, false);
	}

	@Override
	protected void interrupted() {
		System.out.println("I've been interrupted :(");
		driveTrain.customArcadeDrive(0, 0, false);
	}

}
