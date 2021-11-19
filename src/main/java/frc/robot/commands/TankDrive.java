package frc.robot.commands;

/**
 * Remember to check your imports! - Shreyas
 */

import edu.wpi.first.wpilibj2.command.CommandBase;

public class TankDrive extends CommandBase{

	public double leftSpeed;
	public double rightSpeed;

	public TankDrive(){
		setName("TankDrive");

        /**
         * What subsystems do we need? How do we make this file use the subsystems that we require?
		*/

		/**
         * How do we store the speed values for the different sides?
         * What controllers should we be using?
         * If you have question, read the documentation - words of wisdom from Sean Fang (or ask us)
        */
	}

	public void execute(){
		/**
		 * What controls do you need to use to move the robot?
		 * How can we change the motor speed values to match the values that we want?
         * If we run the motors too hard we burn something out. How do we avoid this?
		 */
	}
}