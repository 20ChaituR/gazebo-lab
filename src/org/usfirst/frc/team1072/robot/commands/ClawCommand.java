package org.usfirst.frc.team1072.robot.commands;

import org.usfirst.frc.team1072.robot.Robot;
import org.usfirst.frc.team1072.robot.subsystems.Claw;

import com.sun.corba.se.spi.ior.ObjectId;

import edu.wpi.first.wpilibj.command.Command;

public class ClawCommand extends Command{

	private static boolean openvar;
	
	public ClawCommand() {
		requires(Robot.claw);
		System.out.println("Created a ClawCommand");
	}
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		//finish up, set claw speed to 0
<<<<<<< HEAD
=======
		Robot.claw.setSpeed(0.0);
>>>>>>> origin/master
		System.out.println("Ended a ClawCommand");
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		System.out.println("Executed a claw command");
		setTimeout(1);
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
		System.out.println("Initialized a ClawCommand");
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		System.out.println("Interrupted a ClawCommand");
	}

	@Override
	protected boolean isFinished() {
	    System.out.println("Checked if a ClawCommand was finished");
		// TODO Auto-generated method stub
		//check if the claw is at maximum
//		if (openvar) {
//			if (Robot.claw.getClawVictor().getPosition() == 1) {
//				return true;
//			}
//		} else if (Robot.claw.getClawVictor().getPosition() == 0) {
//			return true;
//		}
		if(isTimedOut()){
			return true;
		}
		return false;
	}

}
