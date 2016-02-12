package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakePneumatics extends Subsystem{

	private static Solenoid intakePiston = new Solenoid(RobotMap.intakePiston1);
	
	public void raiseIntake(JoystickButton button){
		if(button.get()==true){
			
		intakePiston.set(true);
	}}
	
	public void lowerIntake(JoystickButton button){
		if(button.get()==true){
		intakePiston.set(false);
	}}
	
	protected void initDefaultCommand() {
	}

	
}
