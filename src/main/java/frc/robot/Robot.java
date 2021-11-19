// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

// We'll give you these imports, but are there any other imports that you need?
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {
  
	public Robot(){
    	super(0.08);
	}

  	@Override
	public void robotInit() {    
		/**
		 * What kind of things do we need to declare here? How does the robot know what is the drive commands?
		 */
  	}

	@Override
  	public void robotPeriodic() {
    	CommandScheduler.getInstance().run();
  	}

	@Override
	public void autonomousInit() {
		System.out.println("Autonomous Initalized");
    	CommandScheduler.getInstance().cancelAll();
	}

	@Override
	public void autonomousPeriodic() {

	}

	@Override
	public void teleopInit() {
		System.out.println("TeleOp Initalized");
		CommandScheduler.getInstance().cancelAll();
	}

  @Override
	public void teleopPeriodic() {
		/**
		 * Do we need to do anything here? What would go here?
		 */

	}

  @Override
	public void disabledInit() {
		System.out.println("Disabled Initialized");
	    CommandScheduler.getInstance().cancelAll();
	}

	@Override
	public void disabledPeriodic() {}

	@Override
	public void testInit() {}

	@Override
	public void testPeriodic() {}
}
