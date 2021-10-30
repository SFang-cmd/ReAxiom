package frc.robot.commands.vision;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.Subsystems;

public class RotateToBall extends CommandBase {
    
    public double xPos;

    public RotateToBall(){
        setName("RotateToBall");
        addRequirements(Subsystems.driveBase, Subsystems.frontCam);
    }
    public void initialize(){
        xPos = 0.0;
    }

    // In the future, add turn command to make it more efficient,
    // especially with PID; for now, uses tank drive to turn until the 
    public void execute(){
        xPos = Subsystems.frontCam.getX();
        if(xPos > 0.1){
            Subsystems.driveBase.tank.tankDrive(0.1, -0.1);
        } else if(xPos < 0.1){
            Subsystems.driveBase.tank.tankDrive(-0.1, 0.1);
        } else {
            Subsystems.driveBase.stopMotors();
        }
    }

    public boolean isFinished(){
        return (Math.abs(xPos)<=0.6);
    }
}
