package org.usfirst.frc.team4203.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team4203.robot.commands.CommandBase;
import org.usfirst.frc.team4203.robot.commands.Drive;
import org.usfirst.frc.team4203.robot.commands.IntakeLower;
import org.usfirst.frc.team4203.robot.commands.IntakeRaise;
import edu.wpi.first.wpilibj.GyroBase;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CameraServer;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	CameraServer camServer;
 
	//static Gyro gyro = new AnalogGyro(RobotMap.gyroPort);
	Command intakeRaise,intakeLower,drive;	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	CommandBase.init();
    	drive = new Drive();
    	camServer = CameraServer.getInstance();
        camServer.setQuality(50);
        camServer.startAutomaticCapture("cam0");
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
    	drive.start();
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.    	        
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    	LiveWindow.run();
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	Scheduler.getInstance().run();
    }
}
