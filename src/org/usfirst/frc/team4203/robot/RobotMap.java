package org.usfirst.frc.team4203.robot;

public interface RobotMap {

	//Motor port mapping
	public static int driveTrainLMotor1 = 1;
    public static int driveTrainLMotor2 = 2;
    public static int intakeIntakeMotor = 2;
    public static int shooterWinchMotor = 4;
    public static int aimerAimerMotor = 5;
    
    //Solenoid port mapping
    public static int intakePiston1 =0;
    public static int shooterClaw1 = 1;

    //Compressor port
    public static int pneumaticsCompressor = 0;
    
    //Controller button mapping
    public static int intakeOnButton = 3;
    public static int gyroResetButton = 0;
    public static int intakeRaiseButton = 5;
    public static int intakeLowerButton = 4;
    public static int aimPositionButton = 2;
    public static int shootButton = 1; 
    
    //Sensors port mapping
	public static final int gyroPort = 0;

    //Camera
    public static int cameraRingLightRelay = 0;
	public static String cameraIPAddress = "Camera IP";


}
