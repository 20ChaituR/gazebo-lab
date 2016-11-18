package org.usfirst.frc.team1072.robot;

import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team1072.robot.RobotMap.OI.GP;
import org.usfirst.frc.team1072.robot.commands.ClawCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    private GazeboGamepad gp;
    
    public OI(){
        gp = new GazeboGamepad(GP.GP);
        gp.getButtonX().whileHeld(new ClawCommand());
    }

    /**
     * @return the gp
     */
    public GazeboGamepad getGp()
    {
        return gp;
    }

    /**
     * @param gp the gp to set
     */
    public void setGp(GazeboGamepad gp)
    {
        this.gp = gp;
    }
    
}

