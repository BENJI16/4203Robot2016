package org.usfirst.frc.team4203.robot.commands;

// import all subsystems to be used by commands
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4203.robot.OI;
import org.usfirst.frc.team4203.robot.subsystems.*;

public abstract class CommandBase extends Command {

	Command IntakeRaise, IntakeLower;
	public static OI oi;
	public static Aimer aimer = new Aimer();
	public static Intake intake = new Intake();
	public static Shooter shooter = new Shooter();
	public static DriveTrain driveTrain = new DriveTrain(); 
	public static IntakePneumatics intakePneumatics = new IntakePneumatics();
	public static Pneumatics pneumatics = new Pneumatics();
	//public static CameraGoal findGoal = new CameraGoal();
    
    public static void init() {
    oi = new OI();    
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
