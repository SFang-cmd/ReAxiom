package frc.robot.subsystems;

import org.photonvision.PhotonCamera;
import org.photonvision.targeting.PhotonTrackedTarget;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PhotonCam extends SubsystemBase {
    // Make it so that button press initializes this command, checks left and right given specific camera subsystemm gets yaw from there (build subsystem method)
    PhotonCamera frontCam;
    PhotonTrackedTarget target;

    public PhotonCam(String camera){
        setSubsystem("PhotonCam");
        this.frontCam = new PhotonCamera(camera);
        this.target = frontCam.getLatestResult().getBestTarget();
        System.out.println("Created");
    }

    public void getAll(){
        try{
            System.out.println(frontCam.getLatestResult().getBestTarget().getYaw());
            System.out.println(frontCam.getLatestResult().getBestTarget().getPitch());
            System.out.println(frontCam.getLatestResult().getBestTarget().getArea());
            System.out.println(frontCam.getLatestResult().getBestTarget().getSkew());
        } catch(Exception e){
            System.out.println("Error");
        }
    }

    public double getX(){
        try{
            target = frontCam.getLatestResult().getBestTarget();
            // var target = frontCam.getLatestResult().getBestTarget();
            return target.getYaw();
        } catch(Exception e) {
            // return 0.0;
            return 5.0;
        }
    }

    public double getY(){
        try{
            return frontCam.getLatestResult().getBestTarget().getPitch();
        } catch(Exception e){
            return 0.0;
        }
    }

    public void snapshot(boolean processed){
        if(processed){
            frontCam.takeOutputSnapshot();
        } else {
            frontCam.takeInputSnapshot();
        }
    }

}