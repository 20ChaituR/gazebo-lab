package org.usfirst.frc.team1072.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static class OI {
        public static class GP {
            public static class Buttons {
                public static final int UP = 1;
                public static final int DOWN = 2;
                public static final int LEFT = 3;
                public static final int RIGHT = 4;
                public static final int START = 5;
                public static final int BACK = 6;
                public static final int LEFT_STICK_PRESS = 7;
                public static final int RIGHT_STICK_PRESS = 8;
                public static final int LEFT_BUMPER = 9;
                public static final int RIGHT_BUMPER = 10;
                public static final int GUIDE = 11;
                public static final int A = 12;
                public static final int B = 13;
                public static final int X = 14;
                public static final int Y = 15;
            }
            public static class Axes {
                public static final int LEFT_X = 0;
                public static final int LEFT_Y = 1;
                public static final int RIGHT_X = 2;
                public static final int RIGHT_Y = 3;
                public static final int LEFT_TRIGGER = 4;
                public static final int RIGHT_TRIGGER = 5;
            }
            public static final int GP = 0;
        }
    }
    public static class Robot {
        public static class DT {
            public static class Talons {
                public static final int FRONT_LEFT = 1;
                public static final int BACK_LEFT = 2;
                public static final int FRONT_RIGHT = 3;
                public static final int BACK_RIGHT = 4;
            }
            public static class Victors {
                public static final int ELEVATOR = 5;
                public static final int WRIST = 6;
                public static final int CLAW = 7;
            }
            public static class Potentiometers {
                public static final int ELEVATOR = 2;
                public static final int WRIST = 3;
            }
            public static class DigitalInputs {
                public static final int CLAW = 5;
            }
            public static final int GYRO = 1;
        }
    }
}
