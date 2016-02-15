package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import org.usfirst.frc.team4203.robot.commands.IntakePosition;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;


public class IntakePiston extends Subsystem {
    
	
	private final Solenoid intakePiston = new Solenoid(RobotMap.intakePiston1);
	
	
	public void initPosition(){
		
		intakePiston.set(false);
		
	}
	
	public void raise(){
		
		intakePiston.set(true);
		
	}

    public void initDefaultCommand() {
    	
    }
}

