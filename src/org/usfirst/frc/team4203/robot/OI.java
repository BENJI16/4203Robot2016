package org.usfirst.frc.team4203.robot;

import org.usfirst.frc.team4203.robot.commands.*;
import org.usfirst.frc.team4203.robot.subsystems.*;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
    //Controllers
	public Joystick driveStick;
	
	//Axis
	public double throttle;
	public double turn;
	public double intakeSpeed;
	
	//Buttons
	public JoystickButton intakeOnButton;
	public JoystickButton intakeRaiseButton;
	public JoystickButton intakeLowerButton;
	public boolean intakeOnButtonValue;
	public boolean intakeRaiseButtonValue;
	public boolean intakeLowerButtonValue;
	
	public double compressorValue;
    
	public OI() {
		
    	//Controller
		driveStick = new Joystick(RobotMap.controller);
		
		//Axis
    	throttle = driveStick.getY();
    	turn = driveStick.getX();
    	intakeSpeed = driveStick.getZ();
    	
    	//Buttons
    	intakeOnButton = new JoystickButton(driveStick,RobotMap.intakeOnButton);
    	intakeRaiseButton = new JoystickButton(driveStick,RobotMap.intakeRaiseButton);
    	intakeLowerButton = new JoystickButton(driveStick,RobotMap.intakeLowerButton);
    	intakeOnButtonValue = intakeOnButton.get();
    	intakeRaiseButtonValue = intakeRaiseButton.get();
    	intakeLowerButtonValue = intakeLowerButton.get();
    	
    	//Command button assignment
    	intakeOnButton.whenPressed(new IntakeRun());

    	
    	//SmartDashBoard and constant commands
    	SmartDashboard.putData("Drive Enabled", new Drive());
    	SmartDashboard.putNumber("Drive Speed", throttle);
    	SmartDashboard.putNumber("Turn Speed", turn);
    	
    	SmartDashboard.putBoolean("Intake On", intakeOnButtonValue);
    	SmartDashboard.putBoolean("Intake Raised", intakeRaiseButtonValue);
    	SmartDashboard.putBoolean("Intake Lowered", intakeLowerButtonValue);
    	
    	SmartDashboard.putData("Compressor On", new CompressorOn());
   }
    
}

