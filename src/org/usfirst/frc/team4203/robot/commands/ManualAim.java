package org.usfirst.frc.team4203.robot.commands;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class ManualAim extends CommandBase {

    public ManualAim() {
    	requires(aimer);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	aimer.setDefault();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Joystick stick = oi.getXboxController();
    	double zaxis = stick.getZ();
    	aimer.manualAim(zaxis);
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
    	aimer.stop();
    }
}
