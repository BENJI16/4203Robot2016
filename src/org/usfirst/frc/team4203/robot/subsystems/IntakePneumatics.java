package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakePneumatics extends Subsystem{

    private final DoubleSolenoid intakePiston = new DoubleSolenoid(RobotMap.intakePiston1,RobotMap.intakePiston2);
    private final Value raise = Value.kForward;
    private final Value lower = Value.kReverse;
    private final Value off = Value.kOff;
    
    public void intakeRaise(JoystickButton button){
    	
    	if(button.get() == true){
    		intakePiston.set(raise);
    	}
    	else{
    		intakePiston.set(off);
    	}
    }
    public void intakeLower(JoystickButton button){
    	
    	if(button.get() == true){
    		intakePiston.set(lower);
    	}
    	else{
    		intakePiston.set(off);
    	}
    }
	protected void initDefaultCommand() {
		
	}

	
}
