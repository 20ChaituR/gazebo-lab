package org.usfirst.frc.team1072.robot.subsystems;

import org.usfirst.frc.team1072.robot.commands.ClawCommand;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Claw extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private double speed;
	private final int motorNumber = 7;
	private final int digitalInputChannel = 5;
	private Victor clawVictor;
	private double deadzone;
	private boolean inverted = false;
	private DigitalInput digitalInput;
	
	public Claw() {
		clawVictor = new Victor(motorNumber);
		digitalInput = new DigitalInput(digitalInputChannel);
	}
	
	/**
	 * @return the digitalInputChannel
	 */
	public int getDigitalInputChannel() {
		return digitalInputChannel;
	}
	
	/**
	 * @return the motorNumber
	 */
	public int getMotorNumber() {
		return motorNumber;
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
	
	public void openClaw() {
		if (!(clawVictor.getPosition() >= 1 - deadzone && clawVictor.getPosition() <= 1)) {
			setSpeed(0.5);
		}
	}
	
	public void closeClaw() {
		if (!(clawVictor.getPosition() <= deadzone && clawVictor.getPosition() >= 0)) {
			setSpeed(-0.5);
		}
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new ClawCommand());
    }
}

