package org.usfirst.frc.team4203.robot.commands;

import edu.wpi.first.wpilibj.interfaces.Gyro;

public class Drive extends CommandBase {

    public Drive() {

        requires(driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	driveTrain.setDrive(-oi.getJoystick().getY()/1,oi.getJoystick().getX()/1);
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
