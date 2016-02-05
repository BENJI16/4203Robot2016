package org.usfirst.frc.team4203.robot.subsystems;

import org.usfirst.frc.team4203.robot.RobotMap;
import org.usfirst.frc.team4203.robot.commands.IntakeRun;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

    private final CANTalon intakeMotor = new CANTalon(RobotMap.intakeIntakeMotor);
    private final DoubleSolenoid intakePiston = new DoubleSolenoid(RobotMap.intakePiston1,RobotMap.intakePiston2);

    public void initDefaultCommand() {
    }
    public void intakeOn(Double speed){
    	intakeMotor.set(speed);
    }
}

