package org.usfirst.frc.team4203.robot;

import org.usfirst.frc.team4203.robot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
	public Joystick driveStick;
	public double throttle;
	public double turn;
	public JoystickButton intakeOn;
	public double intakeSpeed;
	
    public OI() {
    	
    	throttle = driveStick.getY();
    	turn = driveStick.getX();
    	intakeSpeed = driveStick.getZ();
    	intakeOn = new JoystickButton(driveStick,1);
    	
    	intakeOn.whileHeld(new IntakeRun());
    	
    	SmartDashboard.putData("Enable Drive", new Drive());
   }
    
}

