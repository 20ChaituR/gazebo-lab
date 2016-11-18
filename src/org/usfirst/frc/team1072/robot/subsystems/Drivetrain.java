package org.usfirst.frc.team1072.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;

import org.usfirst.frc.team1072.robot.RobotMap.Robot.DT.Talons;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    private Talon frontLeft, backLeft, frontRight, backRight;
    private Encoder leftEncoder, rightEncoder;
    private Gyro gyro;
    
    public Drivetrain(){
        frontLeft = new Talon(Talons.FRONT_LEFT);
        backLeft = new Talon(Talons.BACK_LEFT);
        frontRight = new Talon(Talons.FRONT_RIGHT);
        backRight = new Talon(Talons.BACK_RIGHT);
        //leftEncoder = new Encoder(Talons.FRONT_LEFT, Talons.BACK_LEFT);
        //rightEncoder = new Encoder(Talons.FRONT_RIGHT, Talons.BACK_RIGHT);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

