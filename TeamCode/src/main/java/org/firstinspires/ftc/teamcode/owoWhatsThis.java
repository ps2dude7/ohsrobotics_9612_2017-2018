package org.firstinspires.ftc.teamcode;

/**
 * HARDWARE MAP created by Garrett and Ryan but mainly just Garrett and some crack cocaine on 11/29/2017. COPYRIGHT circa

 |* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|
 | * * * * * * * * *  :::::::::::::::::::::::::|
 |* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|
 | * * * * * * * * *  :::::::::::::::::::::::::|
 |* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|
 | * * * * * * * * *  ::::::::::::::::::::;::::|
 |* * * * * * * * * * OOOOOOOOOOOOOOOOOOOOOOOOO|
 |:::::::::::::::::::::::::::::::::::::::::::::|
 |OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|
 |:::::::::::::::::::::::::::::::::::::::::::::|
 |OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|
 |:::::::::::::::::::::::::::::::::::::::::::::|
 |OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|

 ヽ(~～~ )ノヽ(~～~ )ノヽ(~～~ )ノヽ(~～~ )ノヽ(~～~ )ノ

 */
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

public class owoWhatsThis {

    //something with Motors
    //REMOVED ALL "null" VALUES ON MOTORS
    public DcMotor leftDrive            = null;
    public DcMotor rightDrive           = null;
    public DcMotor armWinch             = null;
    public DcMotor squishDrive1         = null;
    //public DcMotor squishDrive2         = null;
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
        squishDrive1    = defaultHwMap.get(DcMotor.class, "squishMotor1");
        //squishDrive2    = defaultHwMap.get(DcMotor.class, "squishMotor2");

        //set power to motors on power
        leftDrive.setPower(0);
        rightDrive.setPower(0);
        armWinch.setPower(0);
        squishDrive1.setPower(0);
        //squishDrive2.setPower(0);
        //here us yoiu r v
    }
}
