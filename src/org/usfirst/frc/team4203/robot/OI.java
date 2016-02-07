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
	private Joystick driveStick;
	
	//Buttons
	private JoystickButton intakeOnButton;
	private JoystickButton intakeRaiseLowerButton;
	
	public OI() {
		
    	//Controller
		driveStick = new Joystick(1);
    	
    	//Buttons
    	intakeOnButton = new JoystickButton(driveStick,RobotMap.intakeOnButton);
    	intakeRaiseLowerButton = new JoystickButton(driveStick,RobotMap.intakeRaiseLowerButton);
    	
    	//Command button assignment
    	intakeOnButton.whileHeld(new IntakeRun());
    	
    	//SmartDashBoard and constant commands
    	SmartDashboard.putData("Compressor On", new CompressorOn());
   }
	public Joystick getJoystick(){
		return driveStick;
	}
	public JoystickButton getIntakeButton(){
		return intakeRaiseLowerButton;
	}
    
}

