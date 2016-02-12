package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import org.usfirst.frc.team4203.robot.commands.IntakeRun;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

    private final Relay intakeRelay = new Relay(RobotMap.intakeIntakeMotor);
    
    public void intakeOn(JoystickButton intakeOnButton){
    	intakeRelay.set(Relay.Value.kOn);
    }

	protected void initDefaultCommand() {
		
	}

    
}


