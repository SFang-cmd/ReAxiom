package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotMap;
import frc.robot.subsystems.Subsystems;

public class DriveStraight extends CommandBase {
    
    public double inches;
    public double speed;
    public double ticks;

    public DriveStraight(double inches, double speed){
        setName("DriveStraight");
        addRequirements(Subsystems.driveBase);
        this.inches = inches;
        this.speed = speed;
        this.ticks = RobotMap.convertToTicks(inches);
    }

    public void initialize(){
        Subsystems.driveBase.reCalibrateEncoders();
    }

    public void execute(){
        Subsystems.driveBase.tank.curvatureDrive(speed, 0, false);
        System.out.println(Subsystems.driveBase.getLeftEncoder());
    }

    public boolean isFinished(){        
        return ((Math.abs(Subsystems.driveBase.getLeftEncoder()) > ticks) || (Math.abs(Subsystems.driveBase.getRightEncoder()) > ticks));
    }

    public void end(boolean interrupted){
        Subsystems.driveBase.stopMotors();
    }
}
