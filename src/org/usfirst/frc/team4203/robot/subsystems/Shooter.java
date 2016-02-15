package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter extends Subsystem {
	
	
	private CANTalon pullBackMotor = new CANTalon(RobotMap.shooterWinchMotor);
	private DigitalInput limit = new DigitalInput(RobotMap.limitSwitch);
	private Solenoid piston = new Solenoid(RobotMap.shooterClaw1);
	
	
	public void on(){
		
		pullBackMotor.set(.5);
		
	}
	
	public void off(){
		
		pullBackMotor.set(0);
		
	}
	
	public boolean limit(){
		
		return limit.get();
		
	}
	
	public void lock(){
		
		piston.set(true);
		
	}
	
	public void fire(){
		
		piston.set(false);
	}
	
	public boolean pistonState(){
		
		return piston.get();
		
	}
	
	public void sensorValue(){
		
		SmartDashboard.putBoolean("Limit Switch", limit.get());
		
	}

    public void initDefaultCommand() {
    	
    }
}
