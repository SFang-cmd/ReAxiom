package frc.robot.commands.vision;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.Subsystems;
import frc.robot.RobotMap;

public class RotateToBall extends CommandBase {
    
    public double xPos;
    public double speed;

    public RotateToBall(){
        setName("RotateToBall");
        addRequirements(Subsystems.driveBase, Subsystems.frontCam);
        this.speed = 0;
    }
    public void initialize(){
        xPos = 0.0;
    }

    // In the future, add turn command to make it more efficient,
    // especially with PID; for now, uses tank drive to turn until the 
    public void execute(){
        xPos = Subsystems.frontCam.getX();
        // if(xPos > 0.1){
        //     Subsystems.driveBase.tank.tankDrive(0.1, -0.1);
        // } else if(xPos < 0.1){
        //     Subsystems.driveBase.tank.tankDrive(-0.1, 0.1);
        // } else {
        //     Subsystems.driveBase.stopMotors();
        // }

        // Better method, change the cap amounts after we fiddle with it
        speed = RobotMap.speedCap*RobotMap.cap(xPos, -40, 40)/40;
        Subsystems.driveBase.tank.tankDrive(speed, -1*speed);
        // System.out.println(xPos);
        // Subsystems.driveBase.tank.tankDrive(0.7, 0.7);
        // Subsystems.frontCam.getAll();
        // Subsystems.frontCam.getX();
    }

    public boolean isFinished(){
        return (Math.abs(xPos)<=5);
        // return true;
    }
}
