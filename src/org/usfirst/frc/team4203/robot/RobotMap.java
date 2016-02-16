package org.usfirst.frc.team4203.robot;

public interface RobotMap {

	//Motor port mapping
	public static int driveTrainLMotor1 = 1;
    public static int driveTrainLMotor2 = 2;
    public static int intakeIntakeMotor = 0;
    public static int shooterWinchMotor = 3;
    public static int aimerAimerMotor = 4;
    
    //Solenoid port mapping
    public static int intakePiston1 = 0;
    public static int intakePiston2 = 1;
    public static int shooterClaw1 = 2;
    public static int shooterClaw2 = 3;


    
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
