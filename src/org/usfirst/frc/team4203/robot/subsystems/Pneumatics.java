package org.usfirst.frc.team4203.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem{

	private final Compressor compressor = new Compressor(0);
	
	public void compressorStart(){
		compressor.enabled();
	}
	
	protected void initDefaultCommand() {
		
	}

}
