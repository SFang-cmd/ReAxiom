package frc.robot;

// We were nice and we gave you the ports from pbot ;)

public class RobotMap {
    // Robot Map is a centralized location at which all the numbers (ports, set speeds, etc) for the Robot can be placed
    // so that it can be replaced easily later if need be. 
    
    // Speed controls
    public static double speedCap = 0;
    /**
     * Hmmmmmmm does something needs to be fixed here?
     */
    
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
}
