package org.usfirst.frc.team1072.robot.subsystems;

import org.usfirst.frc.team1072.robot.commands.ArcadeDriveCommand;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Wheel extends Subsystem {
	
	// Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	int deviceNumber;
	int achannel;
	int bchannel;
	double curSpeed;
	double maxAcceleration;
	double difference;
	Talon t;
	Encoder e;
	
	public Wheel(int num, int a, int b) {
		deviceNumber = num;
		achannel = a;
		bchannel = b;
		t = new Talon(deviceNumber);
		e = new Encoder(achannel, bchannel);
	}
	
	public int getEncoderOutput() {
		return e.get();
	}
	
	public boolean maxAcceleration(double a, double b) {
		return Math.abs(a - b) <= maxAcceleration;
	}
	
	public void setSpeed(double speed) {
		if (speed < -1.0) {
			if (maxAcceleration(-1.0, curSpeed)) {
				curSpeed = -1.0;
			} else {
				curSpeed -= maxAcceleration;
			}
		} else if (speed > 1.0) {
			if (maxAcceleration(1.0, curSpeed)) {
				curSpeed = 1.0;
			} else {
				return;
			}
		} else if (-difference > speed && speed > difference) {
			if (maxAcceleration(0.0, curSpeed)) {
				curSpeed = 0.0;
			} else {
				return;
			}
		} else if (speed < -1.0 + difference) {
			if (maxAcceleration(-1.0, curSpeed)) {
				curSpeed = -1.0;
			} else {
				return;
			}
		} else if (speed > 1.0 - difference) {
			if (maxAcceleration(1.0, curSpeed)) {
				curSpeed = 1.0;
			} else {
				return;
			}
		} else {
			if (maxAcceleration(speed, curSpeed)) {
				curSpeed = speed;
			} else {
				return;
			}
		}
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ArcadeDriveCommand());
    }

}
