package org.usfirst.frc.team1072.robot.commands;

import org.usfirst.frc.team1072.robot.Robot;
import org.usfirst.frc.team1072.robot.subsystems.Wrist;

import edu.wpi.first.wpilibj.command.Command;

public class ManualWristCommand extends Command {
	
	public ManualWristCommand() {
		requires(Robot.manualWrist);
	}
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void execute() {
		Robot.manualWrist.setSpeed(Robot.oi.getGp().getRightX().get());
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
