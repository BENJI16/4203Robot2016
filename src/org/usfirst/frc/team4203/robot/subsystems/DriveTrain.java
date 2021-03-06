package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import org.usfirst.frc.team4203.robot.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.RobotDrive;



import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	
    private CANTalon lMotor = new CANTalon(RobotMap.driveTrainLMotor1);
    private CANTalon rMotor = new CANTalon(RobotMap.driveTrainLMotor2);
    private RobotDrive driveMotors = new RobotDrive(rMotor,lMotor);
    
    
    public void setDrive(double moveValue,double rotateValue){
    	
    	driveMotors.arcadeDrive(moveValue, rotateValue);
    	
    }
    
    public void stopDrive(){
    	
    	driveMotors.arcadeDrive(0, 0);
	
    }
    
    public void setPrecisionDrive(double rotateValue){
    	
    	driveMotors.arcadeDrive(0, rotateValue);
    	
    }

    public void initDefaultCommand() {
    	
    	setDefaultCommand(new ArcadeDrive());
    	
    }
    
}

