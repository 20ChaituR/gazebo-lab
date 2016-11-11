/**
 * 
 */
package org.usfirst.frc.team1072.robot;

import org.usfirst.frc.team1072.robot.RobotMap.OI.GP.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * @author joelmanning
 *
 */
public class GazeboGamepad extends Joystick
{
    private GamepadButton dpadUp, dpadDown, dpadLeft, dpadRight, start, back, leftStickPress, rightStickPress, leftBumper, rightBumper, guide, buttonA, buttonB, buttonX, buttonY;
    private Axis leftX, leftY, rightX, rightY, leftTrigger, rightTrigger;
    /**
     * @param port
     */
    public GazeboGamepad(int port)
    {
        super(port);
        dpadUp = new GamepadButton(Buttons.UP);
        dpadDown = new GamepadButton(Buttons.DOWN);
        dpadLeft = new GamepadButton(Buttons.LEFT);
        dpadDown = new GamepadButton(Buttons.RIGHT);
        start = new GamepadButton(Buttons.START);
        back = new GamepadButton(Buttons.BACK);
        leftStickPress = new GamepadButton(Buttons.LEFT_STICK_PRESS);
        rightStickPress = new GamepadButton(Buttons.RIGHT_STICK_PRESS);
        leftBumper = new GamepadButton(Buttons.LEFT_BUMPER);
        rightBumper = new GamepadButton(Buttons.RIGHT_BUMPER);
        guide = new GamepadButton(Buttons.GUIDE);
        buttonA = new GamepadButton(Buttons.A);
        buttonB = new GamepadButton(Buttons.B);
        buttonX = new GamepadButton(Buttons.X);
        buttonY = new GamepadButton(Buttons.Y);
        leftX = new Axis(Axes.LEFT_X);
        leftY = new Axis(Axes.LEFT_Y);
        rightX = new Axis(Axes.RIGHT_X);
        rightY = new Axis(Axes.RIGHT_Y);
        leftTrigger = new Axis(Axes.LEFT_TRIGGER);
        rightTrigger = new Axis(Axes.RIGHT_TRIGGER);
    }
    
    /**
     * @return the dpadUp
     */
    public GamepadButton getDpadUp()
    {
        return dpadUp;
    }

    /**
     * @param dpadUp the dpadUp to set
     */
    public void setDpadUp(GamepadButton dpadUp)
    {
        this.dpadUp = dpadUp;
    }

    /**
     * @return the dpadDown
     */
    public GamepadButton getDpadDown()
    {
        return dpadDown;
    }

    /**
     * @param dpadDown the dpadDown to set
     */
    public void setDpadDown(GamepadButton dpadDown)
    {
        this.dpadDown = dpadDown;
    }

    /**
     * @return the dpadLeft
     */
    public GamepadButton getDpadLeft()
    {
        return dpadLeft;
    }

    /**
     * @param dpadLeft the dpadLeft to set
     */
    public void setDpadLeft(GamepadButton dpadLeft)
    {
        this.dpadLeft = dpadLeft;
    }

    /**
     * @return the dpadRight
     */
    public GamepadButton getDpadRight()
    {
        return dpadRight;
    }

    /**
     * @param dpadRight the dpadRight to set
     */
    public void setDpadRight(GamepadButton dpadRight)
    {
        this.dpadRight = dpadRight;
    }

    /**
     * @return the start
     */
    public GamepadButton getStart()
    {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(GamepadButton start)
    {
        this.start = start;
    }

    /**
     * @return the back
     */
    public GamepadButton getBack()
    {
        return back;
    }

    /**
     * @param back the back to set
     */
    public void setBack(GamepadButton back)
    {
        this.back = back;
    }

    /**
     * @return the leftStickPress
     */
    public GamepadButton getLeftStickPress()
    {
        return leftStickPress;
    }

    /**
     * @param leftStickPress the leftStickPress to set
     */
    public void setLeftStickPress(GamepadButton leftStickPress)
    {
        this.leftStickPress = leftStickPress;
    }

    /**
     * @return the rightStickPress
     */
    public GamepadButton getRightStickPress()
    {
        return rightStickPress;
    }

    /**
     * @param rightStickPress the rightStickPress to set
     */
    public void setRightStickPress(GamepadButton rightStickPress)
    {
        this.rightStickPress = rightStickPress;
    }

    /**
     * @return the leftBumper
     */
    public GamepadButton getLeftBumper()
    {
        return leftBumper;
    }

    /**
     * @param leftBumper the leftBumper to set
     */
    public void setLeftBumper(GamepadButton leftBumper)
    {
        this.leftBumper = leftBumper;
    }

    /**
     * @return the rightBumper
     */
    public GamepadButton getRightBumper()
    {
        return rightBumper;
    }

    /**
     * @param rightBumper the rightBumper to set
     */
    public void setRightBumper(GamepadButton rightBumper)
    {
        this.rightBumper = rightBumper;
    }

    /**
     * @return the guide
     */
    public GamepadButton getGuide()
    {
        return guide;
    }

    /**
     * @param guide the guide to set
     */
    public void setGuide(GamepadButton guide)
    {
        this.guide = guide;
    }

    /**
     * @return the buttonA
     */
    public GamepadButton getButtonA()
    {
        return buttonA;
    }

    /**
     * @param buttonA the buttonA to set
     */
    public void setButtonA(GamepadButton buttonA)
    {
        this.buttonA = buttonA;
    }

    /**
     * @return the buttonB
     */
    public GamepadButton getButtonB()
    {
        return buttonB;
    }

    /**
     * @param buttonB the buttonB to set
     */
    public void setButtonB(GamepadButton buttonB)
    {
        this.buttonB = buttonB;
    }

    /**
     * @return the buttonX
     */
    public GamepadButton getButtonX()
    {
        return buttonX;
    }

    /**
     * @param buttonX the buttonX to set
     */
    public void setButtonX(GamepadButton buttonX)
    {
        this.buttonX = buttonX;
    }

    /**
     * @return the buttonY
     */
    public GamepadButton getButtonY()
    {
        return buttonY;
    }

    /**
     * @param buttonY the buttonY to set
     */
    public void setButtonY(GamepadButton buttonY)
    {
        this.buttonY = buttonY;
    }

    /**
     * @return the leftX
     */
    public Axis getLeftX()
    {
        return leftX;
    }

    /**
     * @param leftX the leftX to set
     */
    public void setLeftX(Axis leftX)
    {
        this.leftX = leftX;
    }

    /**
     * @return the leftY
     */
    public Axis getLeftY()
    {
        return leftY;
    }

    /**
     * @param leftY the leftY to set
     */
    public void setLeftY(Axis leftY)
    {
        this.leftY = leftY;
    }

    /**
     * @return the rightX
     */
    public Axis getRightX()
    {
        return rightX;
    }

    /**
     * @param rightX the rightX to set
     */
    public void setRightX(Axis rightX)
    {
        this.rightX = rightX;
    }

    /**
     * @return the rightY
     */
    public Axis getRightY()
    {
        return rightY;
    }

    /**
     * @param rightY the rightY to set
     */
    public void setRightY(Axis rightY)
    {
        this.rightY = rightY;
    }

    /**
     * @return the leftTrigger
     */
    public Axis getLeftTrigger()
    {
        return leftTrigger;
    }

    /**
     * @param leftTrigger the leftTrigger to set
     */
    public void setLeftTrigger(Axis leftTrigger)
    {
        this.leftTrigger = leftTrigger;
    }

    /**
     * @return the rightTrigger
     */
    public Axis getRightTrigger()
    {
        return rightTrigger;
    }

    /**
     * @param rightTrigger the rightTrigger to set
     */
    public void setRightTrigger(Axis rightTrigger)
    {
        this.rightTrigger = rightTrigger;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "GazeboGamepad [dpadUp=" + dpadUp + ", dpadDown=" + dpadDown
                + ", dpadLeft=" + dpadLeft + ", dpadRight=" + dpadRight
                + ", start=" + start + ", back=" + back + ", leftStickPress="
                + leftStickPress + ", rightStickPress=" + rightStickPress
                + ", leftBumper=" + leftBumper + ", rightBumper=" + rightBumper
                + ", guide=" + guide + ", buttonA=" + buttonA + ", buttonB="
                + buttonB + ", buttonX=" + buttonX + ", buttonY=" + buttonY
                + ", leftX=" + leftX + ", leftY=" + leftY + ", rightX="
                + rightX + ", rightY=" + rightY + ", leftTrigger="
                + leftTrigger + ", rightTrigger=" + rightTrigger + "]";
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((back == null) ? 0 : back.hashCode());
        result = prime * result + ((buttonA == null) ? 0 : buttonA.hashCode());
        result = prime * result + ((buttonB == null) ? 0 : buttonB.hashCode());
        result = prime * result + ((buttonX == null) ? 0 : buttonX.hashCode());
        result = prime * result + ((buttonY == null) ? 0 : buttonY.hashCode());
        result = prime * result
                + ((dpadDown == null) ? 0 : dpadDown.hashCode());
        result = prime * result
                + ((dpadLeft == null) ? 0 : dpadLeft.hashCode());
        result = prime * result
                + ((dpadRight == null) ? 0 : dpadRight.hashCode());
        result = prime * result + ((dpadUp == null) ? 0 : dpadUp.hashCode());
        result = prime * result + ((guide == null) ? 0 : guide.hashCode());
        result = prime * result
                + ((leftBumper == null) ? 0 : leftBumper.hashCode());
        result = prime * result
                + ((leftStickPress == null) ? 0 : leftStickPress.hashCode());
        result = prime * result
                + ((leftTrigger == null) ? 0 : leftTrigger.hashCode());
        result = prime * result + ((leftX == null) ? 0 : leftX.hashCode());
        result = prime * result + ((leftY == null) ? 0 : leftY.hashCode());
        result = prime * result
                + ((rightBumper == null) ? 0 : rightBumper.hashCode());
        result = prime * result
                + ((rightStickPress == null) ? 0 : rightStickPress.hashCode());
        result = prime * result
                + ((rightTrigger == null) ? 0 : rightTrigger.hashCode());
        result = prime * result + ((rightX == null) ? 0 : rightX.hashCode());
        result = prime * result + ((rightY == null) ? 0 : rightY.hashCode());
        result = prime * result + ((start == null) ? 0 : start.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GazeboGamepad other = (GazeboGamepad) obj;
        if (back == null)
        {
            if (other.back != null)
                return false;
        }
        else if (!back.equals(other.back))
            return false;
        if (buttonA == null)
        {
            if (other.buttonA != null)
                return false;
        }
        else if (!buttonA.equals(other.buttonA))
            return false;
        if (buttonB == null)
        {
            if (other.buttonB != null)
                return false;
        }
        else if (!buttonB.equals(other.buttonB))
            return false;
        if (buttonX == null)
        {
            if (other.buttonX != null)
                return false;
        }
        else if (!buttonX.equals(other.buttonX))
            return false;
        if (buttonY == null)
        {
            if (other.buttonY != null)
                return false;
        }
        else if (!buttonY.equals(other.buttonY))
            return false;
        if (dpadDown == null)
        {
            if (other.dpadDown != null)
                return false;
        }
        else if (!dpadDown.equals(other.dpadDown))
            return false;
        if (dpadLeft == null)
        {
            if (other.dpadLeft != null)
                return false;
        }
        else if (!dpadLeft.equals(other.dpadLeft))
            return false;
        if (dpadRight == null)
        {
            if (other.dpadRight != null)
                return false;
        }
        else if (!dpadRight.equals(other.dpadRight))
            return false;
        if (dpadUp == null)
        {
            if (other.dpadUp != null)
                return false;
        }
        else if (!dpadUp.equals(other.dpadUp))
            return false;
        if (guide == null)
        {
            if (other.guide != null)
                return false;
        }
        else if (!guide.equals(other.guide))
            return false;
        if (leftBumper == null)
        {
            if (other.leftBumper != null)
                return false;
        }
        else if (!leftBumper.equals(other.leftBumper))
            return false;
        if (leftStickPress == null)
        {
            if (other.leftStickPress != null)
                return false;
        }
        else if (!leftStickPress.equals(other.leftStickPress))
            return false;
        if (leftTrigger == null)
        {
            if (other.leftTrigger != null)
                return false;
        }
        else if (!leftTrigger.equals(other.leftTrigger))
            return false;
        if (leftX == null)
        {
            if (other.leftX != null)
                return false;
        }
        else if (!leftX.equals(other.leftX))
            return false;
        if (leftY == null)
        {
            if (other.leftY != null)
                return false;
        }
        else if (!leftY.equals(other.leftY))
            return false;
        if (rightBumper == null)
        {
            if (other.rightBumper != null)
                return false;
        }
        else if (!rightBumper.equals(other.rightBumper))
            return false;
        if (rightStickPress == null)
        {
            if (other.rightStickPress != null)
                return false;
        }
        else if (!rightStickPress.equals(other.rightStickPress))
            return false;
        if (rightTrigger == null)
        {
            if (other.rightTrigger != null)
                return false;
        }
        else if (!rightTrigger.equals(other.rightTrigger))
            return false;
        if (rightX == null)
        {
            if (other.rightX != null)
                return false;
        }
        else if (!rightX.equals(other.rightX))
            return false;
        if (rightY == null)
        {
            if (other.rightY != null)
                return false;
        }
        else if (!rightY.equals(other.rightY))
            return false;
        if (start == null)
        {
            if (other.start != null)
                return false;
        }
        else if (!start.equals(other.start))
            return false;
        return true;
    }

    public class GamepadButton extends Button {

        private int port;
        
        /**
         * @param port
         */
        protected GamepadButton(int port)
        {
            super();
            this.port = port;
        }
        
        /**
         * @return the port
         */
        public int getPort()
        {
            return port;
        }

        /**
         * @param port the port to set
         */
        public void setPort(int port)
        {
            this.port = port;
        }

        /* (non-Javadoc)
         * @see edu.wpi.first.wpilibj.buttons.Trigger#get()
         */
        @Override
        public boolean get()
        {
            return getRawButton(port);
        }

        /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString()
        {
            return "GamepadButton [port=" + port + "]";
        }

        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode()
        {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + port;
            return result;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object obj)
        {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            GamepadButton other = (GamepadButton) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (port != other.port)
                return false;
            return true;
        }

        private GazeboGamepad getOuterType()
        {
            return GazeboGamepad.this;
        }
        
    }
    
    public class Axis {
        
        private int port;

        /**
         * @param port
         */
        protected Axis(int port)
        {
            super();
            this.port = port;
        }

        /**
         * @return the port
         */
        public int getPort()
        {
            return port;
        }

        /**
         * @param port the port to set
         */
        public void setPort(int port)
        {
            this.port = port;
        }
        
        public double get(){
            return getRawAxis(port);
        }
        
        public AxisButton createButton(double threshold, boolean negative){
            return new AxisButton(port, threshold, negative);
        }

        /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString()
        {
            return "Axis [port=" + port + "]";
        }

        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode()
        {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + port;
            return result;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object obj)
        {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Axis other = (Axis) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (port != other.port)
                return false;
            return true;
        }

        private GazeboGamepad getOuterType()
        {
            return GazeboGamepad.this;
        }
        
    }
    
    class AxisButton extends Button{
        
        private int port;
        private double threshold;
        private boolean negative;

        /**
         * @param port
         * @param threshold
         * @param negative
         */
        protected AxisButton(int port, double threshold, boolean negative)
        {
            super();
            this.port = port;
            this.threshold = threshold;
            this.negative = negative;
        }
        
        /**
         * @return the port
         */
        public int getPort()
        {
            return port;
        }

        /**
         * @param port the port to set
         */
        public void setPort(int port)
        {
            this.port = port;
        }

        /**
         * @return the threshold
         */
        public double getThreshold()
        {
            return threshold;
        }

        /**
         * @param threshold the threshold to set
         */
        public void setThreshold(double threshold)
        {
            this.threshold = threshold;
        }

        /**
         * @return the negative
         */
        public boolean isNegative()
        {
            return negative;
        }

        /**
         * @param negative the negative to set
         */
        public void setNegative(boolean negative)
        {
            this.negative = negative;
        }

        /* (non-Javadoc)
         * @see edu.wpi.first.wpilibj.buttons.Trigger#get()
         */
        @Override
        public boolean get()
        {
            if(negative){
                return getRawAxis(port) <= -threshold;
            }
            return getRawAxis(port) >= threshold;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString()
        {
            return "AxisButton [port=" + port + ", threshold=" + threshold
                    + ", negative=" + negative + "]";
        }

        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode()
        {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + (negative ? 1231 : 1237);
            result = prime * result + port;
            long temp;
            temp = Double.doubleToLongBits(threshold);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object obj)
        {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            AxisButton other = (AxisButton) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (negative != other.negative)
                return false;
            if (port != other.port)
                return false;
            if (Double.doubleToLongBits(threshold) != Double
                    .doubleToLongBits(other.threshold))
                return false;
            return true;
        }

        private GazeboGamepad getOuterType()
        {
            return GazeboGamepad.this;
        }
        
    }
}
