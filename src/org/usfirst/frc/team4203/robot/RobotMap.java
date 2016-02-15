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

    
    //Controller button mapping
    public static int gyroResetButton = 0;
    public static int intakeOnButton = 3;
    public static int intakePositionButton = 5;
    public static int aimPositionButton = 2;
    public static int loadButton = 4;
    public static int shootButton = 6; 
    
    //Sensors port mapping
	public static int gyroPort = 0;
	public static int limitSwitch = 1;

}
