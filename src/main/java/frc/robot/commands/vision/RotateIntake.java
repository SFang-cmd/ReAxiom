// package frc.robot.commands.vision;
// import frc.robot.userinterface.UserInterface;
// import edu.wpi.first.wpilibj2.command.CommandBase;
// import frc.robot.RobotMap;
// import frc.robot.subsystems.Subsystems;

// public class RotateIntake extends CommandBase {
//     public double yaw;
//     public double area;
//     public double pitch;
//     public double oldYaw;
//     public double oldPitch;
//     public Boolean finished = false;
//     public double extraSpeed;
//    // public double
//     public RotateIntake() {
//         setName("RotateIntake");
//         addRequirements(Subsystems.frontCam,Subsystems.driveBase);
//         this.oldYaw = yaw;
//         this.oldPitch = pitch;
//         this.yaw = Subsystems.frontCam.getX();
//         this.pitch =  Subsystems.frontCam.getY();
//         this.extraSpeed = 0;
//     }
//     public void initialize(){
        
//     }
//     public void execute(){
//         extraSpeed = yaw/30;
//         if (extraSpeed > 0) {
//             if(extraSpeed + UserInterface.driverController.getLeftJoystickY() < RobotMap.speedCap){
//                 //speed of left wheel
//                 // extraSpeed + UserInterfacedriverController.getLeftJoystickY()
//             } else if (extraSpeed + UserInterface.driverController.getLeftJoystickY() > RobotMap.speedCap) {
//                 // speed_left = SpeedCap - current_speed)
//                 // left_wheel += speed_left
//                 // right_wheel -= (OUR EXCESS SPEED - speed_left)
//                 //speed_left
//             }
//         } else if (extraSpeed < 0){
//             extraSpeed = Math.abs();
//         }
        
            
//     }
//     public boolean isFinished(){
//         return finished;
//     }
    
// }
