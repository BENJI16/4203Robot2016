package org.usfirst.frc.team4203.robot;

public interface RobotMap {

	//Motor port mapping
	public static int driveTrainLMotor1 = 0;
    public static int driveTrainLMotor2 = 1;
    public static int driveTrainRMotor1 = 2;
    public static int driveTrainRMotor2 = 3;
    public static int intakeIntakeMotor = 4;
    public static int shooterWinchMotor = 5;
    public static int aimerAimerMotor = 6;
    
    //Solenoid port mapping
    public static int intakePiston1 =0;
    public static int intakePiston2 =1;
    public static int shooterClaw1 = 2;
    public static int shooterClaw2 = 3;

    //Compressor port
    public static int pneumaticsCompressor = 0;
    
    //Controller button mapping
    public static int intakeOnButton = 1;
    public static int intakeRaiseButton = 2;
    public static int intakeLowerButton = 3;


}
