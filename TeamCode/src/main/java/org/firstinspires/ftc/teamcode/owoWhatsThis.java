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
    public DcMotor leftDrive        = null;
    public DcMotor rightDrive       = null;
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
         * the two lines above this(47, 48) are possibly the dumbest thing in the whole world
         * you have a hardware map that is entirely forced to be "defautHwMap" while also in ln. 38
         * there is a hardware map named "updateHwMap" that could have singlehandedly worked everything out
         * with zero issues. But NOOOOO IT HAS TO BE SOME AUTISTIC PIECE OF SHIT WHO WROTE THIS
         * AND HAD NO IDEA WHAT THE FUCK THIS LOOKS LIKE AND ITS IMPOSSIBLE TO CHANGE THE DAMN THING
         * WITHOUT BITCHING AND COMPLAINING ENOUGH FOR YOU NOT TO CARE.
         *
         * /rant
         */

        //Find and Init Motors
        leftDrive           = defaultHwMap.get(DcMotor.class, "leftMotor");
        rightDrive          = defaultHwMap.get(DcMotor.class, "rightMotor");
        pitchArm            = defaultHwMap.get(DcMotor.class, "pitchArm");
        squeezeWallMotor    = defaultHwMap.get(DcMotor.class, "squeezeWall");
        springBlock         = defaultHwMap.get(DcMotor.class, "springBlock");

        leftDrive.setPower(0);
        rightDrive.setPower(0);
        pitchArm.setPower(0);
        squeezeWallMotor.setPower(0);
        springBlock.setPower(0);
        //here us yoiu r v
    }
}
