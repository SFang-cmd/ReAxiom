package frc.robot.commands.vision;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

import frc.robot.subsystems.Subsystems;
import frc.robot.commands.*;
import frc.robot.RobotMap;

import org.photonvision.PhotonUtils;

public class AutoIntakeBall extends SequentialCommandGroup {

    public double distance;
    // public double yaw = Subsystems.photonvision.yaw;

    public AutoIntakeBall(){
        setName("AutoIntakeBall");
    }

    public void initialize(){
        // distance = PhotonUtils.calculateDistanceToTargetMeters(RobotMap.cameraHeightMeters, RobotMap.ballHeightMeters, RobotMap.cameraDegreesHoriz, Subsystems.frontCam.getY());
        distance = 5;
    }
    public void execute(){
        // addCommands(new RotateToBall());
        Subsystems.driveBase.tank.curvatureDrive(0.5,0,false);
        // addCommands(new DriveStraight(distance, 0.5));
    }
}
