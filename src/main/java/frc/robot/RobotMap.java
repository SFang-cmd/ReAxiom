package frc.robot;

public class RobotMap {
    // Robot Map is a centralized location at which all the numbers (ports, set speeds, etc) for the Robot can be placed
    // so that it can be replaced easily later if need be. 
    
    // Speed controls
    public static double speedCap = 0;
    
    // Robot Dimensions
    public static double wheelDiameter = 7;

    // motor port numbers
    // Left side motor port numbers
    public static int leftMiddleMasterPort = 2;

    public static int leftFrontFollower = 3;
    public static int leftBackFollower = 6;
    
    // Right side motor port numbers
    public static int rightMiddleMasterPort = 14;
    
    public static int rightFrontFollower = 5;
    public static int rightBackFollower = 4;
    
    // Intake stuff
    // public static int intakePivot = 46;
    // public static int intakeLeftArm = 9;
    // public static int intakeRightArm = 10;
    // public static int lift = 11;

    // Dimensions for Vision Calculations
    public static double cameraHeightMeters = 0.25;
    public static double ballHeightMeters = 0.1;
    public static double cameraDegreesHoriz = 0;

    /**
     * @param inches Inches to convert.
     * @return The equivalent distance in ticks (units for Talon Encoders).
     */
    public static double convertToTicks(double inches) {
        return (4096 / (wheelDiameter * 3.1415926) * inches);
    }
}
