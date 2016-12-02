package org.usfirst.frc.team1072.robot.subsystems;

import org.usfirst.frc.team1072.robot.commands.ArcadeDriveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Wheel fl;
	private Wheel fr;
	private Wheel bl;
	private Wheel br;
	
	public Drivetrain() {
		fl = new Wheel(0, 0, 0);
		fr = new Wheel(1, 1, 1);
		bl = new Wheel(2, 2, 2);
		br = new Wheel(3, 3, 3);
	}
	
	/**
	 * @return the fl
	 */
	public Wheel getFl() {
		return fl;
	}

	/**
	 * @param fl the fl to set
	 */
	public void setFl(Wheel fl) {
		this.fl = fl;
	}

	/**
	 * @return the fr
	 */
	public Wheel getFr() {
		return fr;
	}

	/**
	 * @param fr the fr to set
	 */
	public void setFr(Wheel fr) {
		this.fr = fr;
	}

	/**
	 * @return the bl
	 */
	public Wheel getBl() {
		return bl;
	}

	/**
	 * @param bl the bl to set
	 */
	public void setBl(Wheel bl) {
		this.bl = bl;
	}

	/**
	 * @return the br
	 */
	public Wheel getBr() {
		return br;
	}

	/**
	 * @param br the br to set
	 */
	public void setBr(Wheel br) {
		this.br = br;
	}

	public void arcadeDrive(double speed, double turn) {
		
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ArcadeDriveCommand());
    }
}

