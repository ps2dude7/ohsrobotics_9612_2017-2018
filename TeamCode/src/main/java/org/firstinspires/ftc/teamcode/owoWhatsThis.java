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
    public DcMotor leftFrontDrive       = null;
    public DcMotor rightFrontDrive      = null;
    public DcMotor leftRearDrive        = null;
    public DcMotor rightRearDrive       = null;
    public DcMotor pitchArm             = null;
    public DcMotor squeezeWallMotor     = null;
    public DcMotor springBlock          = null;
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
        /**
         * For anyone curious.
         *
         * the two lines above this(45, 46) are possibly the dumbest thing in the whole world
         * you have a hardware map that is entirely forced to be "ahwMap" while also in ln. 36
         * there is a hardware map named "hwMap" that could have singlehandedly worked everything out
         * with zero issues. But NOOOOO IT HAS TO BE SOME AUTISTIC PIECE OF SHIT WHO WROTE THIS
         * AND HAD NO IDEA WHAT THE FUCK THIS LOOKS LIKE AND ITS IMPOSSIBLE TO CHANGE THE DAMN THING
         * WITHOUT BITCHING AND COMPLAINING ENOUGH FOR YOU NOT TO CARE.
         *
         * /rant
         */

        //Find and Init Motors
        leftFrontDrive      = defaultHwMap.get(DcMotor.class,  "leftFrontMotor");
        rightFrontDrive     = defaultHwMap.get(DcMotor.class, "rightFrontMotor");
        leftRearDrive       = defaultHwMap.get(DcMotor.class, "leftRearMotor");
        rightRearDrive      = defaultHwMap.get(DcMotor.class, "rightRearMotor");
        pitchArm            = defaultHwMap.get(DcMotor.class, "pitchArm");
        squeezeWallMotor    = defaultHwMap.get(DcMotor.class, "squeezeWall");
        springBlock         = defaultHwMap.get(DcMotor.class, "springBlock");

        leftFrontDrive.setPower(0);
        rightFrontDrive.setPower(0);
        leftRearDrive.setPower(0);
        rightRearDrive.setPower(0);
        pitchArm.setPower(0);
        squeezeWallMotor.setPower(0);
        springBlock.setPower(0);
        //here us yoiu r v
    }
}
