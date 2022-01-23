// package frc.robot.commands.vision;

// import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;

// import frc.robot.subsystems.Subsystems;
// import frc.robot.commands.*;
// import frc.robot.RobotMap;

// import org.photonvision.PhotonUtils;

// public class AutoIntakeBall extends ParallelCommandGroup {

//     public double distance;
//     // public double yaw = Subsystems.photonvision.yaw;

//     public AutoIntakeBall(){
//         setName("AutoIntakeBall");
//         distance = PhotonUtils.calculateDistanceToTargetMeters(RobotMap.cameraHeightMeters, RobotMap.ballHeightMeters, RobotMap.cameraDegreesHoriz, Subsystems.frontCam.getY());
//         // distance = 5;
//         addCommands(new RotateToBall());
//         addCommands(new DriveStraight(distance, 0.5));
//         // Subsystems.driveBase.tank.curvatureDrive(0.5,0,false);
//         // addCommands(new DriveStraight(10, 0.5));
//     }
// }