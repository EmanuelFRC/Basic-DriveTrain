package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.OI;
import org.usfirst.frc.team5426.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5426.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team5426.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * All subsystems need to be initialized in this file first.
 */
public abstract class CommandBase extends Command {

	public static ExampleSubsystem exampleSubsystem;
	public static DriveTrain driveTrain;
	public static Shooter shooter;
	public static OI oi;
	
	final static String INTAKE_SPEED_KEY = "intakeSpeed";
	final static double INTAKE_SPEED_VALUE = 0.15;
	final static String SHOOT_SPEED_KEY = "shootSpeed";
	final static double SHOOT_SPEED_VALUE = 0.30;
	
	static double intake;
	static double shoot;


	public static void init() {

		intake = 0.3;
		shoot = 0.3;
		
		exampleSubsystem = new ExampleSubsystem();
		driveTrain = new DriveTrain();
		shooter = new Shooter(intake, shoot);
		oi = new OI();
	}

	public CommandBase(String name) {
		super(name);
	}

	public CommandBase() {
		super();
	}
	
	public static void updateSmartDashboard() {
		if (exampleSubsystem != null) {
			SmartDashboard.putData("Example Subsystem", exampleSubsystem);
			SmartDashboard.putData("Drive Train", driveTrain);
			SmartDashboard.putData("Shooter", shooter);
			
			SmartDashboard.putNumber("Accel X (g)", driveTrain.getBuiltInAccelerometer().getX());
			SmartDashboard.putNumber("Accel Y (g)", driveTrain.getBuiltInAccelerometer().getY());
			SmartDashboard.putNumber("Accel Z (g)", driveTrain.getBuiltInAccelerometer().getZ());
			
	        SmartDashboard.putNumber("Left Axis Y", OI.getLeftAxisY());
	        SmartDashboard.putNumber("Left Axis X", OI.getLeftAxisX());
	        SmartDashboard.putNumber("Right Axis Y", OI.getRightAxisY());
	        
			SmartDashboard.putNumber(INTAKE_SPEED_KEY, intake);
			SmartDashboard.putNumber(SHOOT_SPEED_KEY, shoot);

		} else {
			init();
		}
	}
	
}
