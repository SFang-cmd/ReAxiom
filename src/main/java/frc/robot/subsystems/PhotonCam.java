package frc.robot.subsystems;

import org.photonvision.PhotonCamera;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PhotonCam extends SubsystemBase {
    // Make it so that button press initializes this command, checks left and right given specific camera subsystemm gets yaw from there (build subsystem method)
    PhotonCamera frontCam;

    public PhotonCam(String camera){
        setSubsystem("PhotonCam");
        this.frontCam = new PhotonCamera(camera);
    }

    public double getX(){
        try{
            return frontCam.getLatestResult().getBestTarget().getYaw();
        } catch(Exception e) {
            return 0.0;
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