package frc.robot.commands.vision;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

import frc.robot.subsystems.Subsystems;
import frc.robot.commands.*;
import frc.robot.RobotMap;

import org.photonvision.PhotonUtils;

public class AutoIntakeBall extends SequentialCommandGroup {

    public double distance;

    public AutoIntakeBall(){
        setName("AutoIntakeBall");
    }

    public void initialize(){
        distance = PhotonUtils.calculateDistanceToTargetMeters(RobotMap.cameraHeightMeters, RobotMap.ballHeightMeters, RobotMap.cameraDegreesHoriz, Subsystems.frontCam.getY());
    }
    public void execute(){
        addCommands(new RotateToBall());
        addCommands(new DriveStraight(distance, 0.5));
    }
}
