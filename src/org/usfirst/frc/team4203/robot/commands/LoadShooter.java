package org.usfirst.frc.team4203.robot.commands;

/**
 *
 */
public class LoadShooter extends CommandBase {

    public LoadShooter() {
    	requires(shooter);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	shooter.on();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(shooter.limit()==true){
    		shooter.lock();
    		shooter.off();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return shooter.pistonState();
    }

    // Called once after isFinished returns true
    protected void end() {    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
