package org.usfirst.frc.team1072.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonClaw extends CommandGroup {
    
    public  AutonClaw() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
		System.out.println("executed a autoncommand");
		ClawCommand c = new ClawCommand();
		addSequential(c);
		addSequential(new TimeCommand(2));
		addSequential(new CancelCommand(c));
    }

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		super.end();
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		super.execute();
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		super.initialize();
		System.out.println("initialized a auton");
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		super.interrupted();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return super.isFinished();
	}
    
}
