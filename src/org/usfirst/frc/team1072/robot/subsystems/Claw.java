package org.usfirst.frc.team1072.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Claw extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	double speed;
	int motorNumber = 7;
	int digitalInputChannel = 5;
	Victor clawVictor;
	double deadzone;
	boolean inverted = false;
	DigitalInput digitalInput;
	
	public Claw(double deadzone, int motorNumber, int digitalInputChannel) {
		this.motorNumber = motorNumber;
		clawVictor = new Victor(motorNumber);
		this.deadzone = deadzone;
		this.digitalInputChannel = digitalInputChannel;
		digitalInput = new DigitalInput(digitalInputChannel);
	}
	
	/**
	 * @return the digitalInputChannel
	 */
	public int getDigitalInputChannel() {
		return digitalInputChannel;
	}

	/**
	 * @param digitalInputChannel the digitalInputChannel to set
	 */
	public void setDigitalInputChannel(int digitalInputChannel) {
		this.digitalInputChannel = digitalInputChannel;
	}

	/**
	 * @return the motorNumber
	 */
	public int getMotorNumber() {
		return motorNumber;
	}

	/**
	 * @param motorNumber the motorNumber to set
	 */
	public void setMotorNumber(int motorNumber) {
		this.motorNumber = motorNumber;
	}

	/**
	 * @return the clawVictor
	 */
	public Victor getClawVictor() {
		return clawVictor;
	}

	/**
	 * @param clawVictor the clawVictor to set
	 */
	public void setClawVictor(Victor clawVictor) {
		this.clawVictor = clawVictor;
	}

	/**
	 * @return the deadzone
	 */
	public double getDeadzone() {
		return deadzone;
	}

	/**
	 * @param deadzone the deadzone to set
	 */
	public void setDeadzone(double deadzone) {
		this.deadzone = deadzone;
	}

	/**
	 * @return the digitalInput
	 */
	public DigitalInput getDigitalInput() {
		return digitalInput;
	}

	/**
	 * @param digitalInput the digitalInput to set
	 */
	public void setDigitalInput(DigitalInput digitalInput) {
		this.digitalInput = digitalInput;
	}

	/**
	 * @return the inverted
	 */
	public boolean isInverted() {
		return inverted;
	}

	/**
	 * 
	 * @param newSpeed the speed to set
	 */
	public void setSpeed(double newSpeed) {
		if (inverted) {
			newSpeed = -newSpeed;
		}
		if (newSpeed <= 1 || newSpeed >= -1) {
			if (newSpeed >= 1 - deadzone) {
				speed = 1;
				clawVictor.set(speed);
			} else if (newSpeed <= deadzone - 1) {
				speed = -1;
				clawVictor.set(speed);
			} else if (newSpeed <= deadzone && -deadzone <= newSpeed) {
				speed = 0;
				clawVictor.set(speed);
			} else {
				speed = newSpeed;
				clawVictor.set(speed);
			}
		}
	}
	
	/**
	 * 
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

