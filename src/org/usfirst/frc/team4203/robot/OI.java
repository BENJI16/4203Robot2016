package org.usfirst.frc.team4203.robot;

import org.usfirst.frc.team4203.robot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4203.robot.subsystems.Aimer;
import org.usfirst.frc.team4203.robot.subsystems.DriveTrain;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	Command precisionDrive;
    //Controllers
	private Joystick driveStick;
	private Joystick xboxController;
	
	//Buttons
	public JoystickButton intakeOnButton;
	public JoystickButton gyroResetButton;
	public JoystickButton intakePositionButton;
	public JoystickButton aimPositionButton;
	public JoystickButton shootButton;
	public JoystickButton loadButton;
	public JoystickButton setPrecisionDrive;
	public JoystickButton cancelPrecisionDrive;
	
	public OI() {
		
    	//Controller
		driveStick = new Joystick(1);
    	xboxController = new Joystick(2);
		
    	//Buttons
    	intakeOnButton = new JoystickButton(xboxController,RobotMap.intakeOnButton);
    	intakePositionButton = new JoystickButton(xboxController,RobotMap.intakePositionButton);
    	aimPositionButton = new JoystickButton(xboxController,RobotMap.aimPositionButton);
    	loadButton = new JoystickButton(xboxController,RobotMap.loadButton);
    	shootButton = new JoystickButton(xboxController,RobotMap.shootButton);
    	
    	//Command button assignment
    	loadButton.whenPressed(new LoadShooter());
		setPrecisionDrive.whenPressed(precisionDrive = new PrecisionDrive());
		cancelPrecisionDrive.cancelWhenPressed(precisionDrive);
    	//SmartDashBoard and constant commands
    	//SmartDashboard.putNumber("Speed of Left",RobotMap.driveTrainLMotor1);
    	//SmartDashboard.putNumber("Speed of Right",RobotMap.driveTrainLMotor2);
   }
	public Joystick getDriveStick(){
		return driveStick;
	}
    public Joystick getXboxController(){
    	return xboxController;
    }
}

