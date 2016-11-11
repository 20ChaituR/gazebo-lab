package org.usfirst.frc.team1072.robot.commands;

import org.usfirst.frc.team1072.robot.Robot;
import org.usfirst.frc.team1072.robot.subsystems.Claw;

import com.sun.corba.se.spi.ior.ObjectId;

import edu.wpi.first.wpilibj.command.Command;

public class ClawCommand extends Command{

	private double speed;
	private boolean openvar;
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		//finish up, set claw speed to 0
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if (Robot.oi.getGp().getButtonX().get()) {
			if (!(Robot.claw.getClawVictor().getPosition() >= 1 - Robot.claw.getDeadzone() && Robot.claw.getClawVictor().getPosition() <= 1)) {
				Robot.claw.setSpeed(0.5);
			}
		} else {
			Robot.claw.setSpeed(-speed);
		}
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		//set claw speed to opening/closing depending on current state
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		//check if the claw is at maximum
		return false;
	}

}
