package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import org.usfirst.frc.team4203.robot.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Aimer extends Subsystem {
	
	private final CANTalon aimMotor = new CANTalon(RobotMap.aimerAimerMotor);

	public void aimShoot(JoystickButton aimShootButton){
				
		
		
	}
    public void initDefaultCommand() {
    		setDefaultCommand(new Shoot());
    }
}

