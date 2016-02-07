package org.usfirst.frc.team4203.robot;

public interface RobotMap {

	//Motor port mapping
	public static int driveTrainLMotor1 = 1;
    public static int driveTrainLMotor2 = 2;
    public static int intakeIntakeMotor = 3;
    public static int shooterWinchMotor = 4;
    public static int aimerAimerMotor = 5;
    
    //Solenoid port mapping
    public static int intakePiston1 =0;
    public static int shooterClaw1 = 1;

    //Compressor port
    public static int pneumaticsCompressor = 0;
    
    //Controller button mapping
    public static int intakeOnButton = 1;
    public static int intakeRaiseLowerButton = 2;
    
    //Camera
    public static int cameraRingLightRelay = 0;
	public static String cameraIPAddress = "Camera IP";


}
