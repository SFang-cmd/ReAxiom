package frc.robot.commands.vision;

import java.util.concurrent.SubmissionPublisher;

import edu.wpi.first.wpilibj.util.Units;
import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.Subsystems;
import frc.robot.RobotMap;

public class GetBallDistance extends CommandBase{
    public double GetBallDistance(){
        double pitch = Subsystems.frontCam.getX();
        double yaw = Subsystems.frontCam.getY();

        double pitchScalar = 0.764697;
        double yawScalar = 0.0938183;
        double pitchPlus = 22.3023;
        double yawPlus = 4.21832;
        double sqrtPlus = 173.855;
        double distance = Math.sqrt(pitchScalar * Math.pow(pitch+pitchPlus,2) + yawScalar * Math.pow(yaw+yawPlus, 2)+sqrtPlus);
        return distance;
    }
}