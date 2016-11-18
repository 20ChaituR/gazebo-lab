package org.usfirst.frc.team1072.robot.commands;

import org.usfirst.frc.team1072.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoelClawCommand extends Command {

    public static enum Action {
        OPEN, CLOSE
    }
    
    private static Action last = Action.CLOSE;
    
    private Action myAction;
    
    public JoelClawCommand(){
        this(last == Action.OPEN ?  (last = Action.CLOSE) : (last = Action.OPEN));
    }
    
    public JoelClawCommand(Action todo) {
        requires(Robot.claw);
        myAction = todo;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        if(myAction == Action.OPEN){
            Robot.claw.setSpeed(-1);
            myAction = Action.CLOSE;
        } else {
            Robot.claw.setSpeed(1);
            myAction = Action.OPEN;
        }
        System.out.println("ClawCommand last : " + last);
        setTimeout(1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut() || (myAction == Action.OPEN && Robot.claw.getDigitalInput().get());
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.claw.setSpeed(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
