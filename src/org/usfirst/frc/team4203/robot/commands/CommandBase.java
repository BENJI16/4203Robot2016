package org.usfirst.frc.team4203.robot.commands;

// import all subsystems to be used by commands
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4203.robot.subsystems.DriveTrain;
import org.usfirst.frc.team4203.robot.subsystems.Aimer;
import org.usfirst.frc.team4203.robot.subsystems.Intake;
import org.usfirst.frc.team4203.robot.subsystems.Pneumatics;
import org.usfirst.frc.team4203.robot.subsystems.Shooter;
import org.usfirst.frc.team4203.robot.OI;

public abstract class CommandBase extends Command {

	public static OI oi;
	public static Aimer aimer = new Aimer();
	public static Intake intake = new Intake();
	public static Pneumatics pneumatics = new Pneumatics();
	public static Shooter shooter = new Shooter();
	public static DriveTrain driveTrain = new DriveTrain(); 

    
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
