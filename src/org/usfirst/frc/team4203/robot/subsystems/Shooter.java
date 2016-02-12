package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import org.usfirst.frc.team4203.robot.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter extends Subsystem {
	
	static CANTalon pullBackMotor = new CANTalon(RobotMap.shooterWinchMotor);
	


	public static void set(double target){
		pullBackMotor.set(target);
	}

    public void initDefaultCommand() {
    }
}
