package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.SPI;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class DriveBase extends SubsystemBase {
    // A class that creates the Drivebase
    /* Drivebase Diagram
      ___________
    0|-         -|0
     | -       - |
    0|--       --|0
     | -       - |
    0|-_________-|0
    
    */
	
	/**
	 * What kind of variables do we need here?
	 * Hint: Think back to motor controllers.
	 * Are there any sensors attached to this subsystem?
	 * Create a differential drive instance. (you can name it anything you want/)
	 * Remember it's okay to forget things that's what debugging is for. - Aaron Wang
	 */

	
    public DriveBase(){
		// required for Subsystems and commands as a way to tell program who do communicate with
		setSubsystem("DriveBase");

		/**
		 * What do we need to do now that we have our motor controller names declared?
			 * How do we set the motor controllers that we just declared to their correct ports?
			 * How do we set up bundles of these so its easier to control
		 * How do we set grab the port numbers without having to copy a bunch of random numbers?
		 * How do we set the mode of the differential drive?
		 */
    }
}
