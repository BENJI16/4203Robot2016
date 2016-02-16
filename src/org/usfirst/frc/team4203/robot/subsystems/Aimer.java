package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import org.usfirst.frc.team4203.robot.commands.*;
import org.usfirst.frc.team4203.robot.Robot;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogOutput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Aimer extends Subsystem {
	
	
	private final CANTalon aimMotor = new CANTalon(RobotMap.aimerAimerMotor);
	private final AnalogOutput outputVoltage = new AnalogOutput(0);
	//private final DigitalInput digitalPort = new DigitalInput(0);
	private final AnalogInput potInput = new AnalogInput(0);
	private boolean pullBackState;
	private double potVoltage;
	private final double maxVoltage = 4.8;
	private final double minVoltage = .2;
	private final double targetVoltage = 3.5;
	

	
	public void manualAim(double zaxis){
		
		potVoltage = potInput.getVoltage();
		double zTargetVoltage = (1.6*zaxis) + 1.9;
		
		if (potVoltage > maxVoltage || potVoltage < minVoltage) {
			
			aimMotor.set(0);
			
		}
		
		else{
			
			if((zTargetVoltage - potVoltage) > .05){
				
				aimMotor.set(.1);
				
			}
			
			else if((zTargetVoltage - potVoltage) < -.05){
				
				aimMotor.set(-.1);
				
			}
			
			else if((zTargetVoltage - potVoltage) < .5 || (zTargetVoltage - potVoltage) > -.5){
				
				aimMotor.set(0);
				
			}
			
		}

	}
	
	public void targetAim(){
		
    	//pullBackState = digitalPort.get();
		potVoltage = potInput.getVoltage();
		
		if (potVoltage > maxVoltage || potVoltage < minVoltage) {
			
			aimMotor.set(0);
			
		}
		
		else{
			
			if ((targetVoltage - potVoltage) > 0.3) {
				
				aimMotor.set(.3);
			
			}
			
			else if((targetVoltage - potVoltage) < -0.3){
				
				aimMotor.set(-.3);
				
			}
			
			else if((targetVoltage - potVoltage) < 0.3 && (targetVoltage - potVoltage) > 0){
				
				aimMotor.set(.1);
				
			}
			
			else if((targetVoltage - potVoltage) > -0.3 && (targetVoltage - potVoltage) < 0){
				
				aimMotor.set(-.1);
				
			}
			
			else if((targetVoltage - potVoltage) < .05){
				
				aimMotor.set(0);
				
			}
			
			else if((targetVoltage - potVoltage) > -.05){
				
				aimMotor.set(0);
				
			}
		}
	}
	
	public void inputs(){
		
		SmartDashboard.getBoolean("Drawback Switch", pullBackState);
    	SmartDashboard.putNumber("Pot Voltage", potInput.getVoltage());
	
	}

    public void initDefaultCommand() {
    		setDefaultCommand(new ManualAim());
    }
}

