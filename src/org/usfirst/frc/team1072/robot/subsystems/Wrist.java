package org.usfirst.frc.team1072.robot.subsystems;

import org.usfirst.frc.team1072.robot.RobotMap;
import org.usfirst.frc.team1072.robot.RobotMap.Robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Wrist extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Victor wrist = new Victor(RobotMap.Robot.DT.Victors.WRIST);
	private static final double maxa = 0.3;
	private boolean thin = false;
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double speed){
		if(Math.abs(this.getSpeed()-speed) > maxa){	
			if(getSpeed() - speed > 0){
				helperSpeed(maxa+getSpeed());
			}else if(getSpeed() - speed < 0){
				helperSpeed(getSpeed()-maxa);
			}
		}else{
			this.helperSpeed(speed);
		}
		return;
	}
	private double getSpeed() {
		return wrist.get();
	}

	public void helperSpeed(double speed){
		if(speed <= 1.0 && speed>=-1.0){
			if(thin)
				wrist.set(-speed);
			else
				wrist.set(speed);
		}else if(speed <= 0.05 && speed >= -0.05){
			wrist.set(0);
		}
		else if(speed >= 1.0){
			if(thin)
				wrist.set(-1.0);
			else
				wrist.set(1.0);
		}else if(speed <= -1.0){
			if(thin)
				wrist.set(1.0);
			else
				wrist.set(-1.0);
		}
	}
    
	public void setReverse(boolean thing){
		thin = thing;
	}
    
}

