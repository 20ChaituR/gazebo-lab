package org.usfirst.frc.team1072.robot.commands;

import org.usfirst.frc.team1072.robot.Robot;
import org.usfirst.frc.team1072.robot.subsystems.Claw;

import com.sun.corba.se.spi.ior.ObjectId;

import edu.wpi.first.wpilibj.command.Command;

public class ClawCommand extends Command{

	private static boolean openvar;
	
	public ClawCommand() {
		requires(Robot.claw);
	}
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		//finish up, set claw speed to 0
		Robot.claw.setSpeed(0.0);
		openvar = !openvar;
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		//set claw speed to opening/closing depending on current state
		if (openvar) {
			openvar = false;
			Robot.claw.setSpeed(-0.5);
		} else {
			openvar = true;
			Robot.claw.setSpeed(0.5);
		}
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		//check if the claw is at maximum
//		if (openvar) {
//			if (Robot.claw.getClawVictor().getPosition() == 1) {
//				return true;
//			}
//		} else if (Robot.claw.getClawVictor().getPosition() == 0) {
//			return true;
//		}
		//isTimedOut()
		return false;
	}

}
