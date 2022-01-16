package frc.robot.commands.vision;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Subsystems;

public class BadRotateIntake extends CommandBase {
    
    private double yaw;
    private double pitch;

    public BadRotateIntake(){
        setName("BadRotateIntake");
        addRequirements(Subsystems.frontCam,Subsystems.driveBase);
        this.yaw = 0;
        this.pitch = 0;
    }

    public void initialize() {
        yaw = Subsystems.frontCam.getX();
        pitch = Subsystems.frontCam.getY();        
    }
    
    public void execute() {
        yaw = Subsystems.frontCam.getX();
        pitch = Subsystems.frontCam.getY();
        if(pitch > -18){
            if(yaw > 7){
                Subsystems.driveBase.tank.tankDrive(0.8, 0.5);
            } else if(yaw < 7) {
                Subsystems.driveBase.tank.tankDrive(0.5, 0.8);
            } else {
                Subsystems.driveBase.tank.tankDrive(0.8, 0.8);
            }
        } else {
            if(yaw > 7){
                Subsystems.driveBase.tank.tankDrive(0.5, -0.5);
            } else if(yaw < 7) {
                Subsystems.driveBase.tank.tankDrive(-0.5, 0.5);
            } else {
                Subsystems.driveBase.tank.tankDrive(0, 0);
            }
        }
    }
    
    public boolean IsFinished() {
        return (Math.abs(yaw) <0.3 && pitch < -17);
    }
}

