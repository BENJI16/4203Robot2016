package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import org.usfirst.frc.team4203.robot.commands.*;
import org.usfirst.frc.team4203.robot.Robot;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogOutput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Aimer extends Subsystem {
	
	private final static CANTalon aimMotor = new CANTalon(RobotMap.aimerAimerMotor);
	
	public AnalogOutput outputVoltage = new AnalogOutput(0);
	public static double targetVoltage = 3.5;
	
	public double port0Voltage;
	
	
	public void aim(){		
		port0Voltage = Robot.analogPort0.getVoltage();

		if ((port0Voltage) > 4.8) {
			aimMotor.set(0);
		
		if ((targetVoltage - port0Voltage) > 0.2) {
			aimMotor.set(.5);
			}
		}
		if ((port0Voltage) < 0.2) {
			aimMotor.set(0);
		}
		
		else {
			aimMotor.set(.1);
		}
	}
	
	public void shortTargetPosition(){
		
	}
	
	public void mediumTargetPosition(){
		
	}
	
	public void longTargetPosition(){
		
	}
	
    public void initDefaultCommand() {
    		setDefaultCommand(new Aim());
    }
}

