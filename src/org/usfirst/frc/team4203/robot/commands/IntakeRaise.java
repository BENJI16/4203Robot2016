package org.usfirst.frc.team4203.robot.commands;

public class IntakeRaise extends CommandBase{
	
	protected void initialize() {
		requires(intakePneumatics);
	}
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	intakePneumatics.intakeRaise(oi.intakeRaiseButton);
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
	