package org.firstinspires.ftc.teamcode;

 // HARDWARE MAP created by Garrett and Ryan but mainly just Garrett on 11/29/2017. COPYRIGHT circa

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class owoWhatsThis {

    //something with Motors
    public DcMotor leftDrive    = null;
    public DcMotor rightDrive   = null;
    public DcMotor armWinch     = null;

    //we got some dope servos
    public Servo clawServo1     = null;
    public Servo clawServo2     = null;
    public Servo clawServo3     = null;
    public Servo clawServo4     = null;
    public Servo jewelStick     = null;
    //youre mom gay

    public ColorSensor color_sensor = null;

    HardwareMap defaultHwMap = null;
    private ElapsedTime period = new ElapsedTime();
    //Idk what this is but dont remove
    //ok
    public owoWhatsThis() {

    }
    //HARDWARE INTERFACES AND MAPPING FOR REALS
    //my name is jeff
    public void init (HardwareMap updateHwMap) {
        defaultHwMap = updateHwMap;

        //Find and Init Motors
        leftDrive       = defaultHwMap.get(DcMotor.class, "leftMotor");
        rightDrive      = defaultHwMap.get(DcMotor.class, "rightMotor");
        armWinch        = defaultHwMap.get(DcMotor.class, "winchMotor");

        //Find and Init servos
        clawServo1      = defaultHwMap.get(Servo.class, "clawTopRight");
        clawServo2      = defaultHwMap.get(Servo.class, "clawBottomRight");
        clawServo3      = defaultHwMap.get(Servo.class, "clawTopLeft");
        clawServo4      = defaultHwMap.get(Servo.class, "clawBottomLeft");
        jewelStick      = defaultHwMap.get(Servo.class, "jewelStick");



        //set power to motors on power
        leftDrive.setPower(0);
        rightDrive.setPower(0);
        armWinch.setPower(0);

        //Position Servos
        clawServo1.setPosition(0);
        clawServo2.setPosition(0);
        clawServo3.setPosition(180);
        clawServo4.setPosition(180);

        jewelStick.setPosition(180);

        //here us yoiu r v
        leftDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        armWinch.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}
