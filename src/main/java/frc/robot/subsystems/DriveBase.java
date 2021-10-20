package frc.robot.subsystems;
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

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

    // 
    // Declaring the motors for the left side
    public WPI_TalonSRX leftMiddleMaster;
    
    public WPI_VictorSPX leftFrontMotor;
    public WPI_VictorSPX leftBackMotor;
    
    // declaring the motors for the right side
    public WPI_TalonSRX rightMiddleMaster;

    public WPI_VictorSPX rightFrontMotor;
    public WPI_VictorSPX rightBackMotor;

    public DriveBase(){
        setName("DriveBase");

        this.leftMiddleMaster = new WPI_TalonSRX(RobotMap.leftMiddleMasterPort);

        this.leftFrontMotor = new WPI_VictorSPX(RobotMap.leftFrontFollower);
        this.leftBackMotor = new WPI_VictorSPX(RobotMap.leftBackFollower);
        
        this.rightMiddleMaster = new WPI_TalonSRX(RobotMap.rightMiddleMasterPort);
        
        this.rightFrontMotor = new WPI_VictorSPX(RobotMap.rightFrontFollower);
        this.rightBackMotor = new WPI_VictorSPX(RobotMap.rightBackFollower);
        
        // This is bad practice but I don't really care as long as it works right now
        // For future reference, always initialize variables and declare an instance of the variable for this stuff like above
        SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftMiddleMaster, leftFrontMotor, leftBackMotor);
        SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(rightMiddleMaster, rightFrontMotor, rightBackMotor);

        DifferentialDrive tank = new DifferentialDrive(leftMotorGroup, rightMotorGroup);
    }

    public void setSpeed(){
        
    }



    
}
