package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter extends Subsystem {
	
	
	private CANTalon pullBackMotor = new CANTalon(RobotMap.shooterWinchMotor);
	private DigitalInput limit = new DigitalInput(RobotMap.limitSwitch);
	private DoubleSolenoid piston = new DoubleSolenoid(RobotMap.shooterClaw1,RobotMap.shooterClaw2);
	
	
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
		
		piston.set(DoubleSolenoid.Value.kReverse);
		
	}
	
	public void fire(){
		
		piston.set(DoubleSolenoid.Value.kForward);
	}
	
	public void release(){
		
		//pullBackMotor.wait(timeout);
		
	}
	
	public String pistonState(){
		
		return piston.get().toString();
		
	}
	
	public void sensorValue(){
		
		SmartDashboard.putBoolean("Limit Switch", limit.get());
		
	}

    public void initDefaultCommand() {
    	
    }
}
