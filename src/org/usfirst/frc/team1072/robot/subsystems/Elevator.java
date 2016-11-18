package org.usfirst.frc.team1072.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends PIDSubsystem {
    Victor v;
    AnalogPotentiometer ap;
    public static final double P = 1;
    public static final double I = 0;
    public static final double D = 1;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Elevator(){
    	super(P,I,D);
    	Victor v = new Victor(5);
    	AnalogPotentiometer ap  = new AnalogPotentiometer(2);
    	
    }
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	
	public void setSpeed(double speed){
		if(speed<-1.0) setSetpoint(-1.0);
		else if(speed<1.0) setSetpoint(1.0);
		setSetpoint(speed);
	}
	public double getSpeed(){
		return v.get();
	}
	
	public double checkPosition(){
		return ap.get();
	}

	@Override
	protected double returnPIDInput() {
		return getSpeed();
	}

	@Override
	protected void usePIDOutput(double output) {
		v.set(output);
	}
	
		
	
    
}

