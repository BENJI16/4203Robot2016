package org.usfirst.frc.team4203.robot;

import org.usfirst.frc.team4203.robot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4203.robot.subsystems.Aimer;
import org.usfirst.frc.team4203.robot.subsystems.DriveTrain;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
    //Controllers
	private Joystick driveStick;
	private Joystick playStick;
	
	//Buttons
	public JoystickButton intakeOnButton;
	public JoystickButton gyroResetButton;
	public JoystickButton intakeRaiseButton;
	public JoystickButton intakeLowerButton;
	public JoystickButton aimPositionButton;
	public JoystickButton shootButton;
	
	public OI() {
		
    	//Controller
		driveStick = new Joystick(1);
    	playStick = new Joystick(2);
		
    	//Buttons
    	intakeOnButton = new JoystickButton(playStick,RobotMap.intakeOnButton);
    	intakeRaiseButton = new JoystickButton(playStick,RobotMap.intakeRaiseButton);
    	intakeLowerButton = new JoystickButton(playStick,RobotMap.intakeLowerButton);
    	gyroResetButton = new JoystickButton(driveStick,RobotMap.gyroResetButton);
    	aimPositionButton = new JoystickButton(playStick,RobotMap.aimPositionButton);
    	shootButton = new JoystickButton(playStick,RobotMap.shootButton);
    	
    	//Command button assignment
    	intakeOnButton.whileHeld(new IntakeRun());
    	aimPositionButton.whileHeld(new Aim());
    	intakeRaiseButton.whenPressed(new IntakeRaise());
    	intakeLowerButton.whenPressed(new IntakeLower());
		
    	//SmartDashBoard and constant commands
    	SmartDashboard.putNumber("Speed of Left",RobotMap.driveTrainLMotor1);
    	SmartDashboard.putNumber("Speed of Right",RobotMap.driveTrainLMotor2);
   }
	public Joystick getJoystick(){
		return playStick;
	}
    
}

