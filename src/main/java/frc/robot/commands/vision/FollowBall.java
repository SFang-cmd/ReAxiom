package frc.robot.commands.vision;

import org.photonvision.PhotonUtils;

import edu.wpi.first.wpilibj.util.Units;
import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.Subsystems;
import frc.robot.RobotMap;

public class FollowBall extends CommandBase{

    public double distance;
    public double xPos;
    public double turnSpeed;
    public double travelSpeed;

    public FollowBall(){
        setName("FollowBall");
        addRequirements(Subsystems.driveBase, Subsystems.frontCam);
    }

    public void initialize(){
        distance = PhotonUtils.calculateDistanceToTargetMeters(RobotMap.cameraHeightMeters, RobotMap.ballHeightMeters, RobotMap.cameraDegreesHoriz, Subsystems.frontCam.getY());
        xPos = 0;
    }
    
    public void execute(){
        distance = PhotonUtils.calculateDistanceToTargetMeters(RobotMap.cameraHeightMeters, RobotMap.ballHeightMeters, Units.degreesToRadians(RobotMap.cameraDegreesHoriz), Units.degreesToRadians(Subsystems.frontCam.getY()));
        travelSpeed = Math.log1p(distance*10)*0.5;
        travelSpeed = RobotMap.cap(travelSpeed, 0.4, 0.8);

        xPos = Subsystems.frontCam.getX();
        turnSpeed = RobotMap.cap(Math.abs(xPos)*0.01, 0.2, 0.8);
        turnSpeed *= Math.signum(xPos);
        Subsystems.driveBase.tank.curvatureDrive(travelSpeed, turnSpeed, true);
        // System.out.println(distance);
        // System.out.println(travelSpeed + " Travel Speed");
        // System.out.println(turnSpeed + " Turn speed");
    }

    public boolean isFinished(){
        return distance < 0.1;
    }
    
}
