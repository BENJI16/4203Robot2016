package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import org.usfirst.frc.team4203.robot.commands.IntakeRaiseLower;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakePneumatics extends Subsystem{

	private static Solenoid intakePiston = new Solenoid(RobotMap.intakePiston1);
	
	public static void raiseIntake(){
		intakePiston.set(true);
	}
	public static void lowerIntake(){
		intakePiston.set(false);
	}
	public static Solenoid getPiston(){
		return intakePiston;
	}
	
	protected void initDefaultCommand() {
		setDefaultCommand(new IntakeRaiseLower());
	}

	
}
