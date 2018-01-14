package org.firstinspires.ftc.teamcode;

 // HARDWARE MAP created by Garrett and Ryan but mainly just Garrett on 11/29/2017. COPYRIGHT circa

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.CRServo;

public class owoWhatsThis {

    //something with Motors
    public DcMotor leftDrive    = null;
    public DcMotor rightDrive   = null;
    public DcMotor armWinch     = null;
    public DcMotor relicMotor   = null;

    //we got some dope servos
    public Servo clawServo1     = null;
    public Servo clawServo2     = null;
    public Servo clawServo3     = null;
    public Servo clawServo4     = null;
    public Servo jewelStick     = null;

    public CRServo relicServo1    = null;
    //youre mom gay

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
        relicMotor      = defaultHwMap.get(DcMotor.class, "relicMotor");

        //Find and Init servos
        clawServo1      = defaultHwMap.get(Servo.class, "clawTopRight");
        clawServo2      = defaultHwMap.get(Servo.class, "clawBottomRight");
        clawServo3      = defaultHwMap.get(Servo.class, "clawTopLeft");
        clawServo4      = defaultHwMap.get(Servo.class, "clawBottomLeft");
        jewelStick      = defaultHwMap.get(Servo.class, "jewelStick");
        relicServo1     = defaultHwMap.get(CRServo.class, "relicServo1");

        //set power to motors on power
        leftDrive.setPower(0);
        rightDrive.setPower(0);
        armWinch.setPower(0);
        relicMotor.setPower(0);

        //Position Servos
        clawServo1.setPosition(40);
        clawServo2.setPosition(40);
        clawServo3.setPosition(140);
        clawServo4.setPosition(140);

        relicServo1.setPower(0);
        jewelStick.setPosition(90);

        //here us yoiu r v
        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        armWinch.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        relicMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }
}
