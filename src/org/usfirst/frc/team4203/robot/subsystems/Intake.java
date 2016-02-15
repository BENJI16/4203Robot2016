package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import org.usfirst.frc.team4203.robot.commands.IntakeRun;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	

    private final Relay intakeRelay = new Relay(RobotMap.intakeIntakeMotor);

    
    public void intakeToggleRun(JoystickButton button){
    	
    	if(button.get()==true){
    		
    	intakeRelay.set(Relay.Value.kOn);
    	
    	}
    	
    	else if(button.get()==false){
    		
    		intakeRelay.set(Relay.Value.kOff);
    		
    	}
    	
    	else{
    		
    	}
    	
    }
    

	protected void initDefaultCommand() {
		setDefaultCommand(new IntakeRun());
	}

    
}


